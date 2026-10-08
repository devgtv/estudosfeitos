import  java.util.ArrayList;

class ItemPedido
{
    private int qtde;
    private String nome;
    private double preco;

    ItemPedido(String nome, int qtde, double preco)
    {
        this.nome = nome;
        this.qtde = qtde;
        this.preco = preco;
    }

    String getNome()
    {
        return this.nome;
    }

    int getQtde()
    {
        return this.qtde;
    }

    double getPreco()
    {
        return this.preco;
    }
}

public class Pedido {
    private int id;
    private ArrayList <ItemPedido> itens;

    public Pedido(int id)
    {
        this.id = id;
        this.itens = new ArrayList <>();
    }

    void adicionarItem(String produto, int quantidade, double preco)
    {
        ItemPedido novoItem = new ItemPedido((produto), quantidade, preco);
        this.itens.add(novoItem);
    }

    void removerItem(String produto)
    {
        for(ItemPedido item : itens)
        {
            if(item.getNome().equals(produto))
            {
                this.itens.remove(item);
                return;
            }
        }
        System.out.println("Produto não encontrado");
        return;
    }

    int getId()
    {
        return this.id;
    }

    public static void main(String[] args)
    {
        Pedido meuPedido = new Pedido(101);
        
        meuPedido.adicionarItem("Mouse", 2, 150.50);
        meuPedido.adicionarItem("Teclado", 1, 300.00);

        meuPedido = null;
    } 

}