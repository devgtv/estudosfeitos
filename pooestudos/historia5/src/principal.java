public class principal {
    public static void main(String[] args) {
        termostato meutermostato = new termostato(18.0, 26.0);

        meutermostato.consultaresto();
        meutermostato.diminuirtemperatura();
    }
}