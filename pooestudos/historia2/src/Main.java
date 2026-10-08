import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Parquimetro parquimetro = new Parquimetro();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\n--- PARQUIMETRO ZONA AZUL ---");
            System.out.println("1. Inserir moeda (0.25, 0.50, 1.00)");
            System.out.println("2. Consultar tempo restante");
            System.out.println("3. Simular passagem do tempo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o valor da moeda (0.25, 0.50 ou 1.00): ");
                        if (scanner.hasNextDouble()) {
                            double valor = scanner.nextDouble();
                            parquimetro.inserirMoeda(valor);
                        } else {
                            System.out.println("Valor invalido.");
                            scanner.next();
                        }
                        break;
                    case 2:
                        parquimetro.consultarTempo();
                        break;
                    case 3:
                        System.out.print("Digite quantos minutos deseja passar: ");
                        if (scanner.hasNextInt()) {
                            int minutos = scanner.nextInt();
                            parquimetro.passarTempo(minutos);
                        } else {
                            System.out.println("Valor invalido.");
                            scanner.next();
                        }
                        break;
                    case 0:
                        System.out.println("Encerrando o atendimento. Obrigado!");
                        break;
                    default:
                        System.out.println("Opcao invalida.");
                }
            } else {
                System.out.println("Por favor, digite um numero valido.");
                scanner.next();
            }

        } while (opcao != 0);

        scanner.close();
    }
}