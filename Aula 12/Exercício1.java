public class exercicio1 {
    String nome;
    double n1, n2, trab;

    Aluno(String nome, double n1, double n2, double trab) {
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
        this.trab = trab;
    }

    double Media() {
        return (n1 + n2 + trab) / 3;
    }

    void verificaraprovado() {
        if (Media() >= 7)
            System.out.println(nome + "O aluno está:" + " " + "APROVADO");
        else
            System.out.println(nome + "O aluno está:" + " " + "REPROVADO");
    }
}

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("João", 8, 7, 9);
        Aluno a2 = new Aluno("Maria", 5, 6, 4);

        a1.verificarSituacao();
        a2.verificarSituacao();
    }
}
