public class Main {
    public static void main(String[] args) {
        ContaCorrente minhaConta = new ContaCorrente("12345-6", "Ana Souza");

        minhaConta.consultarExtrato();

        minhaConta.depositar(200.00);
        minhaConta.sacar(50.00);
        minhaConta.sacar(200.00);

        minhaConta.aplicarTarifaMensal();

        minhaConta.consultarExtrato();
    }
}