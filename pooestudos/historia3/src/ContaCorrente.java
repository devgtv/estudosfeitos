public class ContaCorrente {
    private String numeroConta;
    private String nomeTitular;
    private Double saldo;

    public ContaCorrente(String numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if(valor > 0) {
            saldo += valor;
            System.out.println("Foi depositado");
        } else {
            System.out.println("O valor depositado deveria ser positivo");
        }
    }

    public void sacar(double valor) {
        if(valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Foi sacado");
        } else {
            System.out.println("Nao foi possivel sacar");
        }
    }

    public void aplicarTarifaMensal() {
        double tarifa = 15.00;
        if(saldo >= tarifa) {
            saldo -= tarifa;
        }
    }

    public void consultarExtrato() {
        System.out.println("--- Extrato Resumido ---");
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Titular: " + nomeTitular);
        System.out.println("Saldo Atual: R$ " + saldo);
    }
}

