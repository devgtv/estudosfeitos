public class termostato {
    private double temperaturaatual;
    private final double temperaturaminima;
    private final double temperaturamaxima;

    public termostato(double tmin, double tmax) {
        this.temperaturaatual = 22.0;
        this.temperaturaminima = tmin;
        this.temperaturamaxima = tmax;
    }

    public void aumentartemperatura() {
        this.temperaturaatual += 1.0;
        verificartemperatura();
    }

    public void diminuirtemperatura() {
        this.temperaturaatual -= 1.0;
        verificartemperatura();
    }

    public void verificartemperatura() {
        if (this.temperaturaatual < this.temperaturaminima) {
            java.lang.System.out.println("status: temperatura abaixo da minima. ligar aquecimento!");
        } else if (this.temperaturaatual > this.temperaturamaxima) {
            java.lang.System.out.println("status: temperatura acima da maxima. ligar resfriamento!");
        } else {
            java.lang.System.out.println("status: temperatura dentro da faixa de conforto.");
        }
    }

    public void consultaresto() {
        boolean esta_na_faixa = (this.temperaturaatual >= this.temperaturaminima && this.temperaturaatual <= this.temperaturamaxima);
        double pontomedio = (this.temperaturaminima + this.temperaturamaxima) / 2.0;
        double diferenca = this.temperaturaatual - pontomedio;

        java.lang.System.out.println("temperatura atual: " + this.temperaturaatual + "c");
        java.lang.System.out.println("esta na faixa de conforto? " + esta_na_faixa);
        java.lang.System.out.println("diferenca para o ponto medio: " + diferenca + "c");
    }
}