import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

class Livro
    {
        private static int contadorGlobal = 1;
        private int id_livro;
        private String titulo;
        private String autor;
        private String ano_publi;
        private boolean estado;
        private LocalDate dataRetirada;
        private LocalDate dataDevol;
        public Livro()
        {

        }
        public Livro(String titulo, String autor, String ano)
        {
            this.id_livro = Livro.contadorGlobal;
            Livro.contadorGlobal++;
            this.titulo = titulo;
            this.autor = autor;
            this.ano_publi = ano;
            this.estado = true;
        }

        void setTitulo(String t)
        {
            this.titulo = t;
        }

        void setAutor(String a)
        {
            this.autor = a;
        }

        void setAno_publi(String a)
        {
            this.ano_publi = a;
        }

        void setid()
        {
            this.id_livro = Livro.contadorGlobal;
            Livro.contadorGlobal++;
        }

        void setEstado()
        {
            this.estado = true;
        }

        void consultar()
        {
            if(this.estado)
            {
                System.out.println("Livro disponível");
            }
            else
            {
                System.out.println("Livro indisponível");
            }
        }

        void emprestar()
        {
            this.estado = false;
            this.dataRetirada = LocalDate.now();
            this.dataDevol = dataRetirada.plusDays(7);
        }
        
        long multa()
        {
            long diasAtraso = ChronoUnit.DAYS.between(dataDevol, LocalDate.now());
            long valorMulta = diasAtraso * 2;
            return valorMulta;
        }

        void devolver()
        {
            this.estado = true;
            if(LocalDate.now().isAfter(this.getDataDevol()))
            {
                System.out.println("Multa de devolução: " + this.multa());
            }
            this.dataDevol = null;
        }

        LocalDate getDataDevol()
        {
            return this.dataDevol;
        }

        int getid()
        {
            return this.id_livro;
        }

        String getTitulo()
        {
            return this.titulo;
        }

        String getAutor()
        {
            return this.autor;
        }

        String getAnoPubli()
        {
            return this.ano_publi;
        }

        boolean getEstado()
        {
            return this.estado;
        }


    }

public class Biblioteca {

    private ArrayList<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo() + " - " + livro.getAutor() + " - " + livro.getAnoPubli());
        }
    }

     static Livro buscarLivroPorId(int idProcurado, ArrayList<Livro> livros)
    {
        int i;
        for(i = 0; i < livros.size(); i++)
        {
            if(livros.get(i).getid() == idProcurado)
            {
                break;
            }
        } 
        if(i >= livros.size())
        {
            System.out.println("Livro não cadastrado");
            return null;
        }
        else
        {
            return livros.get(i);
        }
    }

    void emprestarLivro(int id)
    {
        Livro emprestado = buscarLivroPorId(id, livros);
        if(emprestado == null)
        {
            System.out.println("Livro inexistente");
            return ;
        }
        if(emprestado.getEstado() == false)
        {
            System.out.println("Livro indisponível\n");
            return;
        }
        emprestado.emprestar();
    }
        
    void devolverLivro(int id)
    {
        Livro devolvido = buscarLivroPorId(id, livros);
        if(devolvido == null)
        {
            System.out.println("Livro inexistente");
            return;
        }
        devolvido.devolver();
    }
}
