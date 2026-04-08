import java.util.Scanner;

public class exercicio6 {
  public static void main (String[] args) {
 
    Scanner SC = new Scanner(System.in);

    System.out.print("Digite uma frase :");
    String frase = SC.nextLine();

    System.out.print("Digite uma palavra: ");
    String palavra = SC.nextLine();

    int posicao = frase.indexOf(palavra);

    if (posicao != -1) {
      System.out.println("A palavra foi encontrada aqui" + "" + posicao);
    } else {
      System.out.println("A palavra não foi encontrada");
    }

    SC.close();

  }
}
    
