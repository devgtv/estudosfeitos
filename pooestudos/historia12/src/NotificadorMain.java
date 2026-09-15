import java.util.ArrayList;
import java.util.List;

interface Notificador
{
    public boolean notificar(String destinatario, String mensagem); 
}

class NotificadorEmail implements Notificador
{
    @Override 
    public boolean notificar(String destinatario, String mensagem)
    {
        System.out.println("Notificação de email para: " + destinatario);
        System.out.println("Mensagem: " + mensagem);
        return true;
    }
}

class NotificadorSMS implements Notificador
{
    @Override 
    public boolean notificar(String destinatario, String mensagem)
    {
        System.out.println("Notificação de SMS para: " + destinatario);
        System.out.println("Mensagem: " + mensagem);
        return true;
    }
}



public class NotificadorMain {
    private final List<Notificador> notificacoes = new ArrayList<>();

    void adicionarNotificacao(Notificador n)
    {
        notificacoes.add(n);
    }

    public static void main(String[] args)
    {
        NotificadorMain app = new NotificadorMain();
        Notificador email = new NotificadorEmail();
        Notificador sms = new NotificadorSMS();

        app.adicionarNotificacao(email);
        app.adicionarNotificacao(sms);

        for (Notificador notificacao : programa.notificacoes)
        {
            notificacao.notificar("destinatario", "Mensagem de teste");
        }
    }

}
