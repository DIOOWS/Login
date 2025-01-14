import java.util.Objects; // Importa a classe Objects para comparação segura de objetos
import java.util.Scanner; // Importa a classe Scanner para entrada de dados pelo usuário

public class Login {

    // Atributos privados para armazenar o login e a senha
    private String login;
    private int senha;

    // Construtor para inicializar os atributos login e senha
    public Login(String login, int senha) {
        this.login = login;
        this.senha = senha;
    }

    // Método para validar o login e a senha fornecidos com os armazenados
    public boolean validarLogin(String login, int senha) {
        // Compara o login usando Objects.equals e verifica se a senha coincide
        return Objects.equals(this.login, login) && this.senha == senha;
    }

    public static void main(String[] args) {
        // Cria uma instância de Login com os dados pré-definidos
        Login usuario = new Login("diogo", 1234);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o Login: ");
        String loginInput = scanner.nextLine(); // Lê a entrada como uma string

        System.out.print("Digite a senha: ");
        int senhaInput = scanner.nextInt(); // Lê a entrada como um inteiro

        // Verifica se o login e a senha estão corretos
        if (usuario.validarLogin(loginInput, senhaInput)) {
            // Exibe mensagem de boas-vindas se os dados estiverem corretos
            System.out.println("Bem-vindo, " + loginInput + "!");
        } else {
            // Exibe mensagem de erro caso os dados estejam incorretos
            System.out.println("Login ou senha incorretos!");
        }

        // Fecha o Scanner para liberar recursos
        scanner.close();
    }
}
