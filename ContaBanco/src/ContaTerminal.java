import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: conhecer e importar a classe Scanner
        //Exibir as mensagens para o usuário
        //Obter pela classe Scanner os valores digitados no Terminal
        //Exibir a mensagem de conta criada no Terminal

        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0;

        Scanner scanner = new Scanner(System.in).useLocale(new Locale("pt", "BR"));

        System.out.println("Por favor, digite o número da Agência!");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite a Agência!");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente!");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial!");
        saldo = scanner.nextDouble();

        scanner.close();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque \n", nomeCliente, agencia, numero, saldo);
    }
}
