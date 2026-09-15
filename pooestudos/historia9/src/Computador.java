class Processador
{
    private String num_serie;
    private String nome;
    private boolean ligado;

    Processador(String num, String nome)
    {
        this.num_serie = num;
        this.nome = nome;
        this.ligado = false;
    }

    public String getNum_serie() {
        return num_serie;
    }

    public String getNome() {
        return nome;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void iniciar()
    {
        this.ligado = true;
    }
}

public class Computador {

    private String num_serie;
    private String nome;
    private Processador processador;
    
    Computador(String num, String nome, String num_cpu, String nome_cpu)
    {
        this.num_serie = num;
        this.nome = nome;
        this.processador = new Processador(num_cpu, nome_cpu);
    }

    public void ligar()
    {
        this.processador.iniciar();
    }

    public String getNum_serie() {
        return num_serie;
    }

    public void setNum_serie(String num_serie) {
        this.num_serie = num_serie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
