import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sucesso = false;

        while (!sucesso) {
            try {
                System.out.print("Digite o primeiro número inteiro: ");
                int num1 = Integer.parseInt(scanner.nextLine());

                System.out.print("Digite o segundo número inteiro: ");
                int num2 = Integer.parseInt(scanner.nextLine());

                int resultado = num1 / num2;

                System.out.println("Resultado da divisão: " + resultado);
                sucesso = true; // encerra o loop

            } catch (NumberFormatException e) {
                System.out.println("Erro: você deve digitar apenas números inteiros.");
            } catch (ArithmeticException e) {
                System.out.println("Erro: não é possível dividir por zero.");
            }

            if (!sucesso) {
                System.out.println("Tente novamente.\n");
            }
        }

        scanner.close();
    }
}
