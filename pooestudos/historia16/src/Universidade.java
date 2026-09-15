import java.util.ArrayList;

class Campus
{
    private int id;
    private String nome;
    private boolean administrado;

    public Campus(int id, String nome)
    {
        this.id = id;
        this.nome = nome;
        this.administrado = false;
    }

    int getId()
    {
        return this.id;
    }

    String getNome()
    {
        return this.nome;
    }

    boolean getAdm()
    {
        return this.administrado;
    }

    void administrar()
    {
        this.administrado = true;
    }

    void removAdm()
    {
        this.administrado = false;
    }
}

public class Universidade {
    private String cnpj;
    private String nome;
    private  ArrayList <Campus> administra;

    public Universidade(String cnpj, String nome)
    {
        this.cnpj = cnpj;
        this.nome = nome;
        this.administra = new ArrayList <>();
    }

    String getCnpj()
    {
        return this.cnpj;
    }

    String getNome()
    {
        return this.nome;
    }

    void adicionarCampus(Campus c)
    {
        if(c == null)
        {
            System.out.println("Campus inexistente");
            return;
        }
        if(c.getAdm())
        {
            System.out.println("Campus já está sob administração");
            return;
        }

        this.administra.add(c);
        c.administrar();
        System.out.println("Campus sob administração");

    }

    void removerCampus(Campus c)
    {
        if(c == null)
        {
            System.out.println("Campus inexistente");
            return;
        }
        if(this.administra.remove(c))
        {
            c.removAdm();
            System.out.println("Campus removido da administração");
            return;
        }
        System.out.println("Não foi possível remover campus");
    }

    public static void main(String[] args)
    {
        Campus campusSul = new Campus(1, "Campus Sul");
        Universidade universidade = new Universidade("12.345.678/0001-90", "Universidade Federal");

        universidade.adicionarCampus(campusSul);

        universidade = null;

        System.out.println(campusSul.getNome());
        System.out.println(campusSul.getAdm());
    }
}

