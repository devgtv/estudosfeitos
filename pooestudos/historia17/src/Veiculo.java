public abstract class Veiculo {
    protected  String fabricante;
    protected String ano;

    public Veiculo(String fabricante, String ano)
    {
        this.fabricante = fabricante;
        this.ano = ano;
    }

    public abstract void acelerar();

}

class Carro extends  Veiculo
{
    public Carro(String fabricante, String ano)
    {
        super(fabricante, ano);
    }

    @Override
    public void acelerar()
    {
        System.out.println("Acelerando com 4 rodas");
    }

}

class Motocicleta extends  Veiculo
{
    public Motocicleta(String fabricante, String ano)
    {
        super(fabricante, ano);
    }

    @Override
    public void acelerar()
    {
        System.out.println("Acelerando com 2 rodas");
    }

}
