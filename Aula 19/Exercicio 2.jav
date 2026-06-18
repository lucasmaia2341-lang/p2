import java.util.Scanner;

class LoginInvalidoException extends Exception {
    public LoginInvalidoException(String mensagem) {
        super(mensagem);
    }
}

class SistemaLogin {
    private String senhaSecreta;

    public SistemaLogin() {
        senhaSecreta = "123456";
    }

    public void fazerLogin(String usuario, String senha)
            throws LoginInvalidoException {

        if (!senha.equals(senhaSecreta)) {
            throw new LoginInvalidoException("Credenciais incorretas");
        }

        System.out.println("Login realizado com sucesso!");
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SistemaLogin sistema = new SistemaLogin();

        System.out.print("Digite o login: ");
        String usuario = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        try {
            sistema.fazerLogin(usuario, senha);
        } catch (LoginInvalidoException e) {
            System.out.println("Acesso Negado: Credenciais incorretas");
        }

        scanner.close();
    }
}
