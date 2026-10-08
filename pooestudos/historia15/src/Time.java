import java.util.ArrayList;

class Jogador
{
    private String cpf;
    private String nome;
    private boolean contratado;

    public  Jogador(String cpf, String nome)
    {
        this.cpf = cpf;
        this.nome = nome;
        this.contratado = false;
    }

    String getCpf()
    {
        return  this.cpf;
    }

    String getNome()
    {
        return this.nome;
    }

    boolean verificarContrato()
    {
        return this.contratado;
    }

    void contrato()
    {
        this.contratado = true;
    }

    void dispensado()
    {
        this.contratado = false;
    }
}

public class Time {
    
    private String cnpj;
    private String nome;

    private ArrayList <Jogador> elenco;

    public  Time(String cnpj, String nome)
    {
        this. cnpj = cnpj;
        this.nome = nome;
        this.elenco = new ArrayList <>();
    }

    String getCnpj()
    {
        return  this.cnpj;
    }

    String getNome()
    {
        return this.nome;
    }

    void contratar(Jogador j)
    {
        if(j == null)
        {
            System.out.println("Jogador inexistente");
            return;
        }
        if(j.verificarContrato())
        {
            System.out.println("Jogador pertencente a outro time");
            return;
        }
        this.elenco.add(j);
        j.contrato();
        System.out.println("Jogador contratado");
    }

    void dispensar(Jogador j)
    {
        if(j == null)
        {
            System.out.println("Jogador inexistente");
            return;
        }
        if(this.elenco.remove(j))
        {
            j.dispensado();
            System.out.println("Jogador dispensado");
            return;
        }
        System.out.println("Nao foi possivel dispensar o jogador");
    }
}
