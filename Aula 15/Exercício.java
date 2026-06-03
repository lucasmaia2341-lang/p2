import java.util.ArrayList;
import java.util.Scanner;

class Funcionario {
    String nome;
    String cpf;
    double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}

class Gerente extends Funcionario {

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double getSalario() {
        return salario + 2000;
    }
}

class Atendente extends Funcionario {
    double comissao;

    public Atendente(String nome, String cpf, double salario, double comissao) {
        super(nome, cpf, salario);
        this.comissao = comissao;
    }

    @Override
    public double getSalario() {
        return salario + comissao;
    }
}

// Classe principal
public class Exercicio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Funcionario> lista = new ArrayList<>();

        int op;

        do {
            System.out.println("\n1 - Adicionar Gerente");
            System.out.println("2 - Adicionar Atendente");
            System.out.println("3 - Listar Funcionários");
            System.out.println("4 - Mostrar Salário");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {

                case 1:

                    System.out.print("Nome: ");
                    String nomeG = sc.nextLine();

                    System.out.print("CPF: ");
                    String cpfG = sc.nextLine();

                    System.out.print("Salário: ");
                    double salG = sc.nextDouble();

                    lista.add(new Gerente(nomeG, cpfG, salG));

                    break;

                case 2:

                    System.out.print("Nome: ");
                    String nomeA = sc.nextLine();

                    System.out.print("CPF: ");
                    String cpfA = sc.nextLine();

                    System.out.print("Salário: ");
                    double salA = sc.nextDouble();

                    System.out.print("Comissão: ");
                    double com = sc.nextDouble();

                    lista.add(new Atendente(nomeA, cpfA, salA, com));

                    break;

                case 3:

                    for (Funcionario f : lista) {
                        System.out.println("----------------");
                        System.out.println("Nome: " + f.nome);
                        System.out.println("CPF: " + f.cpf);
                        System.out.println("Salário: " + f.getSalario());
                    }

                    break;

                case 4:

                    System.out.print("Digite o CPF: ");
                    String cpfBusca = sc.nextLine();

                    for (Funcionario f : lista) {
                        if (f.cpf.equals(cpfBusca)) {
                            System.out.println("Salário: " + f.getSalario());
                        }
                    }

                    break;

                case 5:
                    System.out.println("Fim do programa");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (op != 5);

        sc.close();
    }
}
