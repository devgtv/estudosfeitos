public class Parquimetro {
    private static final int TEMPO_POR_MOEDA_MINUTOS = 15;
    private static final int MAX_TEMPO_MINUTOS = 120;
    private int saldoTempoMinutos;

    public Parquimetro() {
        this.saldoTempoMinutos = 0;
    }

    public void inserirMoeda(double valor) {
        int minutosAdicionais = 0;

        if (valor == 0.25) {
            minutosAdicionais = 15;
        } else if (valor == 0.50) {
            minutosAdicionais = 30;
        } else if (valor == 1.00) {
            minutosAdicionais = 60;
        } else {
            System.out.println("Moeda invalida. Aceita-se apenas R$ 0,25, R$ 0,50 e R$ 1,00.");
            return;
        }

        if (this.saldoTempoMinutos + minutosAdicionais > MAX_TEMPO_MINUTOS) {
            System.out.println("Insercao rejeitada. O limite maximo de permanencia e de 2 horas.");
            return;
        }

        this.saldoTempoMinutos += minutosAdicionais;
        System.out.printf("Moeda de R$ %.2f inserida. Tempo total adquirido: %d minutos.%n", valor, this.saldoTempoMinutos);
    }

    public void consultarTempo() {
        if (this.saldoTempoMinutos <= 0) {
            System.out.println("Tempo esgotado! Alerta: O veiculo esta irregular.");
        } else {
            System.out.printf("Tempo restante de permanencia: %d minutos.%n", this.saldoTempoMinutos);
        }
    }

    public void passarTempo(int minutos) {
        this.saldoTempoMinutos -= minutos;
        if (this.saldoTempoMinutos <= 0) {
            this.saldoTempoMinutos = 0;
            System.out.println("ALERTA: O tempo de permanencia expirou!");
        }
    }

    public int getSaldoTempoMinutos() {
        return saldoTempoMinutos;
    }
}