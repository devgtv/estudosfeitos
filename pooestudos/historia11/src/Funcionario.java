public abstract class Funcionario {
    protected  String nome;
    protected  double salarioBase;

    public Funcionario(String nome, double salario)
    {
        this.nome = nome;
        this.salarioBase = salario;
    }

    public abstract void calcularSalario();
    
}

class Gerente extends Funcionario
{
    public Gerente(String nome, double salario)
    {
        super(nome, salario);
    }

    @Override 
    public void calcularSalario()
    {
        this.salarioBase = this.salarioBase * 1.20;
    }
}

class Desenvolvedor extends Funcionario
{
    private int horasTrabalhadas;
    public Desenvolvedor(String nome, double salario, int horasTrabalho)
    {
        super(nome, salario);
        this.horasTrabalhadas = horasTrabalho;
    }

    @Override 
    public void calcularSalario()
    {
        this.salarioBase += (this.salarioBase * 0.10) * this.horasTrabalhadas;
    }
}
