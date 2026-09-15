import java.util.Map;
import java.util.HashMap;

interface  Repositorio {
    void salvar(Object obj);
    Object buscar(int id);
    void remover(int id);
    
}


public class RepositorioMemoria implements Repositorio{
    private Map<Integer, Object> dados = new HashMap<>();
    private int contadorIds = 0;
    @Override
    public void salvar(Object obj)
    {
        dados.put(this.contadorIds, obj);
        this.contadorIds++;
    }

    public Object buscar(int id)
    {
        if(dados.containsKey(id))
        {
            return dados.get(id);
        }
        else
        {
            System.out.println("Id digitado não corresponde a nenhum objeto cadastrado");
            return null;
        }   
    }

    public void remover(int id)
    {
        if(dados.containsKey(id))
        {
            dados.remove(id);
            return;
        }
        else
        {
            System.out.println("Id digitado não corresponde a nenhum objeto cadastrado");
            return;
        }  
    }
    

    public static void main(String args[])
    {
        Repositorio r = new RepositorioMemoria();
        Object objeto = new Object();
        r.salvar(objeto);
        System.out.println("Imprimindo teste: " + r.buscar(0));
        r.remover(0);
    }
}
