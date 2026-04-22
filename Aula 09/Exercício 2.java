import java.util.Scanner;

public class Main {

    public static int maiorValor(int[] array) {
        int maior = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }
        return maior;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você quer digitar? ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int maior = maiorValor(array);

        System.out.println("O maior valor é: " + maior);

        scanner.close();
    }
}
