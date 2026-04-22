import java.util.Scanner;

public class Exercicio4 {

    public static int[] contarParesImpares(int[] array) {
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        return new int[]{pares, impares};
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

        int[] resultado = contarParesImpares(array);

        System.out.println("Quantidade de pares: " + resultado[0]);
        System.out.println("Quantidade de ímpares: " + resultado[1]);

        scanner.close();
    }
}
