public class maquinacafe {
    private int pocafe;
    private int agua;

    public maquinacafe(int poinicial, int aguainicial) {
        this.pocafe = poinicial;
        this.agua = aguainicial;
    }

    public void prepararcafe() {
        if (pocafe < 7 && agua < 30) {
            java.lang.System.out.println("preparo recusado: faltam po de cafe e agua!");
        } else if (pocafe < 7) {
            java.lang.System.out.println("preparo recusado: po de cafe em falta!");
        } else if (agua < 30) {
            java.lang.System.out.println("preparo recusado: agua em falta!");
        } else {
            pocafe -= 7;
            agua -= 30;
            java.lang.System.out.println("cafe expresso preparado com sucesso!");
        }
    }

    public void reabastecerpo(int gramas) {
        if (gramas > 0) {
            pocafe += gramas;
            java.lang.System.out.println("po de cafe reabastecido. total atual: " + pocafe + "g");
        } else {
            java.lang.System.out.println("quantidade invalida.");
        }
    }

    public void reabasteceragua(int ml) {
        if (ml > 0) {
            agua += ml;
            java.lang.System.out.println("agua reabastecida. total atual: " + agua + "ml");
        } else {
            java.lang.System.out.println("quantidade invalida.");
        }
    }

    public void consultar() {
        int cafespo = pocafe / 7;
        int cafesagua = agua / 30;
        int totalcafes = (cafespo < cafesagua) ? cafespo : cafesagua;

        java.lang.System.out.println("po restante: " + pocafe + "g");
        java.lang.System.out.println("agua restante: " + agua + "ml");
        java.lang.System.out.println("cafes disponiveis: " + totalcafes);
    }
}