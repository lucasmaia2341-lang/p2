import java.util.Scanner;

public class exercicio3 {
  public static void main (String[] args) {
    Scanner SC = new Scanner (System.in);

    System.out.print("Digite o primeiro nome: ");
    String name1 = SC.nextLine();

    System.out.println("A quantidade de caracteres é: "+ name1.length());

    SC.close();
  }
}  
