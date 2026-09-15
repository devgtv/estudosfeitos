import java.util.ArrayList;

class Paciente
{
    private int id;
    private String nome;
    
    public Paciente()
    {

    }

    int getId()
    {
        return this.id;
    }

    String getNome()
    {
        return this.nome;
    }
}


public class Medico {

    private ArrayList <Paciente> pacientes;
    private String crm;
    private String nome;
    public Medico()
    {
        this.pacientes = new ArrayList<>();
    }

    String getCrm()
    {
        return this.crm;
    }

    String getNome()
    {
        return this.nome;
    }

    void atender(Paciente p)
    {
        this.pacientes.add(p);
    }
    
    void listarPacientes()
    {
        for(Paciente i : pacientes)
        {
            System.out.println("id: " + i.getId() + " - nome: " + i.getNome());
        }
    }
}
