class Salario
{
    private double valorBruto;

    public Salario(double valorBruto)
    {
        this.valorBruto = valorBruto;
    }

    public double getValorBruto()
    {
        return this.valorBruto;
    }

    public double getValorLiquido(double imposto)
    {
        return this.valorBruto - imposto;
    }
}

public class CalculadoraImposto
{
    public double calcular(Salario s)
    {
        return s.getValorBruto() * 0.15;
    }

    public static void main(String[] args)
    {
        Salario salario = new Salario(4000.00);
        CalculadoraImposto calculadora = new CalculadoraImposto();
        
        double imposto = calculadora.calcular(salario);
        double salarioLiquido = salario.getValorLiquido(imposto);
        
        System.out.println(salarioLiquido);
    }
}