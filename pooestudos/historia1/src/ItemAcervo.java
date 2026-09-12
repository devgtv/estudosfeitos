import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ItemAcervo {

    private String titulo;
    private String autor;
   private int anoPublicacao;
    private String situacao;
    private LocalDate dataPrevisaoDevolucao;
    private LocalDate dataRetirada;

    public ItemAcervo(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        situacao = "DISPONIVEL";
    }

    public void retirar() {
        if(situacao.equals("INDISPONIVEL")) {
            throw new IllegalStateException("O item ja esta emprestado");
        }
        situacao = "INDISPONIVEL";
        dataRetirada = LocalDate.now();
        dataPrevisaoDevolucao = dataRetirada.plusDays(7);
    }

    public double devolver(LocalDate dataRealDevolucao) {
        if(situacao.equals("DISPONIVEL")) {
            throw new IllegalStateException("O item ja se encontra disponivel.");
        }

        double multa = calcularMulta(dataRealDevolucao);

        situacao = "DISPONIVEL";
        dataRetirada = null;
        dataPrevisaoDevolucao = null;

        return multa;
    }

    public double calcularMulta(LocalDate dataReferencia) {
        if(dataPrevisaoDevolucao != null && dataReferencia.isAfter(dataPrevisaoDevolucao)) {
            long diasAtraso = ChronoUnit.DAYS.between(dataPrevisaoDevolucao, dataReferencia);
            return diasAtraso * 2.00;
        }
        return 0.0;
    }
}