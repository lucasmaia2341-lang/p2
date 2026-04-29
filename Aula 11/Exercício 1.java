class Produto {
    String nome;
    double preco;
    int quantidade;

    Produto(String n, double p, int q) {
        nome = n;
        preco = p;
        quantidade = q;
    }

    void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Total: " + (preco * quantidade));
        System.out.println();
    }

    double calcularValorTotalEmEstoque() {
        return preco * quantidade;
    }

    void adicionarEstoque(int q) {
        quantidade = quantidade + q;
    }
}

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Caderno", 20.0, 3);
        Produto p2 = new Produto("Caneta", 2.5, 10);

        p1.exibirInfo();
        p2.exibirInfo();

        System.out.println("Valor total do p1: " + p1.calcularValorTotalEmEstoque());

        p1.adicionarEstoque(2);

        System.out.println("Depois de adicionar estoque:");
        p1.exibirInfo();
    }
}
