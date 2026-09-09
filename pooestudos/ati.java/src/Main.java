import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("=== CADASTRO DO ITEM ===");
        System.out.print("Digite o titulo: ");
        String titulo = scanner.nextLine();

        System.out.print("Digite o autor: ");
        String autor = scanner.nextLine();

        System.out.print("Digite o ano de publicacao: ");
        int ano = Integer.parseInt(scanner.nextLine());

        ItemAcervo item = new ItemAcervo(titulo, autor, ano);
        System.out.println("\nItem cadastrado  situacao atual: DISPONIVEL\n");

        int opcao = 0;
        while (opcao != 4) {
            System.out.println("=== MENU DE OPCOES ===");
            System.out.println("1. Retirar item");
            System.out.println("2. Devolver item");
            System.out.println("3. Calcular multa atual");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = Integer.parseInt(scanner.nextLine());

            try {
                if (opcao == 1) {
                    item.retirar();
                    System.out.println("\nItem retirado com sucesso! Previsao de devolucao para daqui a 7 dias.\n");
                } else if (opcao == 2) {
                    System.out.print("Digite a data da devolucao (dd/mm/aaaa): ");
                    String dataStr = scanner.nextLine();
                    LocalDate dataDevolucao = LocalDate.parse(dataStr, formatter);

                    double multa = item.devolver(dataDevolucao);
                    System.out.println("\nItem devolvido com sucesso!");
                    if (multa > 0) {
                        System.out.println("Houve atraso. Valor da multa: R$ " + multa + "\n");
                    } else {
                        System.out.println("Devolucao dentro do prazo. Sem multas.\n");
                    }
                } else if (opcao == 3) {
                    System.out.print("Digite a data de referencia para consulta (dd/mm/aaaa): ");
                    String dataStr = scanner.nextLine();
                    LocalDate dataRef = LocalDate.parse(dataStr, formatter);

                    double multaAtual = item.calcularMulta(dataRef);
                    System.out.println("\nMulta acumulada ate esta data: R$ " + multaAtual + "\n");
                } else if (opcao == 4) {
                    System.out.println("\nSaindo do programa...");
                } else {
                    System.out.println("\nOpcao invalida!\n");
                }
            } catch (Exception e) {
                System.out.println("\nErro: " + e.getMessage() + "\n");
            }
        }

        scanner.close();
    }
}