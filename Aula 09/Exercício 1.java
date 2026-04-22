import java.util.Scanner;

public class Exercicio1 {

    public static double calcularHipotenusa(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do cateto a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor do cateto b: ");
        double b = scanner.nextDouble();

        double resultado = calcularHipotenusa(a, b);

        System.out.println("A hipotenusa é: " + resultado);

        scanner.close();
    }
}
