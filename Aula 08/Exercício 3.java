import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tipo de combustível (A-álcool, G-gasolina): ");
        char tipo = sc.next().toUpperCase().charAt(0);

        System.out.print("Digite a quantidade de litros: ");
        double litros = sc.nextDouble();

        double precoLitro = 0;
        double desconto = 0;

        if (tipo == 'A') {
            precoLitro = 4.50;
            if (litros <= 20) {
                desconto = 0.03;
            } else {
                desconto = 0.05;
            }
        } else if (tipo == 'G') {
            precoLitro = 6.00;
            if (litros <= 20) {
                desconto = 0.04;
            } else {
                desconto = 0.06;
            }
        } else {
            System.out.println("Tipo de combustível inválido.");
            sc.close();
            return;
        }

        double valorSemDesconto = litros * precoLitro;
        double valorFinal = valorSemDesconto - (valorSemDesconto * desconto);

        System.out.println("Valor a pagar: R$ " + valorFinal);

        sc.close();
    }
}
