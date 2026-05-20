import java.util.ArrayList;
import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Adicionar item");
            System.out.println("2 - Listar itens");
            System.out.println("3 - Remover item");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {

                case 1:
                    System.out.print("Digite o item: ");
                    String item = sc.nextLine();

                    lista.add(item);

                    System.out.println("Item adicionado!");
                    break;

                case 2:
                    System.out.println("\n=== LISTA DE COMPRAS ===");

                    if (lista.isEmpty()) {
                        System.out.println("Lista vazia.");
                    } else {

                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println(i + " - " + lista.get(i));
                        }
                    }

                    break;

                case 3:

                    System.out.println("\n=== REMOVER ITEM ===");

                    if (lista.isEmpty()) {
                        System.out.println("Lista vazia.");
                    } else {

                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println(i + " - " + lista.get(i));
                        }

                        System.out.print("Digite o índice do item: ");
                        int indice = sc.nextInt();

                        if (indice >= 0 && indice < lista.size()) {

                            lista.remove(indice);

                            System.out.println("Item removido!");
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    }

                    break;

                case 4:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 4);

        sc.close();
    }
}
