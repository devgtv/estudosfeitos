class Documento
{
    private String texto;

    public Documento(String texto)
    {
        this.texto = texto;
    }

    public String getTexto()
    {
        return this.texto;
    }
}

public class Formatador
{
    public String formatarMaiusculo(Documento d)
    {
        if (d.getTexto() == null)
        {
            return "";
        }
        return d.getTexto().toUpperCase();
    }

    public String formatarTitulo(Documento d)
    {
        if (d.getTexto() == null || d.getTexto().isEmpty())
        {
            return "";
        }
        return d.getTexto().substring(0, 1).toUpperCase() + d.getTexto().substring(1).toLowerCase();
    }

    public static void main(String[] args)
    {
        Documento doc = new Documento("exemplo de texto para o diagrama");
        Formatador formatador = new Formatador();

        String textoMaiusculo = formatador.formatarMaiusculo(doc);
        String textoTitulo = formatador.formatarTitulo(doc);

        System.out.println(textoMaiusculo);
        System.out.println(textoTitulo);
    }
}