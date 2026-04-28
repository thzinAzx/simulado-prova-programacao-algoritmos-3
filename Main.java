import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorCompra = 0, valorPago = 0;

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("\nDigite o valor da compra: R$ ");
        valorCompra = scanner.nextDouble();

        do{
            System.out.print("\nDigite o valor pago: R$ ");
            valorPago = scanner.nextDouble();

            if (valorPago < valorCompra) {
                System.out.println("Valor pago é insuficiente. Por favor, tente novamente.");
                continue;
            }

            break;
        }while (valorPago < valorCompra);

        System.out.println("\n\n" + nome + " | Compra: " + valorCompra + " | Pago: " + valorPago);
        System.out.println("Troco: R$ " + (valorPago - valorCompra) + "\n");
        double troco = valorPago - valorCompra;
        int[] notas = {200,100, 50, 20, 10, 5, 2, 1};

        for(int nota : notas) {
            int quantidade = (int) (troco / nota);
            if (quantidade > 0) {
                System.out.println(quantidade + " nota(s) de R$ " + nota);
                troco -= quantidade * nota;
            }
        }
        scanner.close();
    }
}