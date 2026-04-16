import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade < 16) {
            System.out.println("Você não pode votar.");
        } else if (idade < 18 || idade > 70) {
            System.out.println("Seu voto é opcional.");
        } else {
            System.out.println("Seu voto é obrigatório.");
        }

        sc.close();
    }
}
