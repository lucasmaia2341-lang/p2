import java.util.Scanner;

public class Exercicio3 {

    public static boolean elementoExiste(String[] array, String busca) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(busca)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas palavras você quer digitar? ");
        int n = scanner.nextInt();
        scanner.nextLine(); // limpar buffer

        String[] array = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite a palavra " + (i + 1) + ": ");
            array[i] = scanner.nextLine();
        }

        System.out.print("Digite a palavra que deseja buscar: ");
        String busca = scanner.nextLine();

        boolean existe = elementoExiste(array, busca);

        System.out.println("Existe no array? " + existe);

        scanner.close();
    }
}
