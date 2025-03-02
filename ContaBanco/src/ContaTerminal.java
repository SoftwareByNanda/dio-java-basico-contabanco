import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da agência: ");
        int agencia = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o número da Conta: ");
        String conta = scanner.nextLine();

        // Use um scanner.nextLine() extra logo
        // após scanner.nextInt() para consumir o
        // caractere pendente antes de pedir o nome do cliente:

        System.out.println("Digite o seu nome completo: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o valor para depósito: R$:");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("\nDados Cadastrados: ");
        System.out.println("Conta: " + conta);
        System.out.println("Agencia: " + agencia);
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("\nOlá " + nomeCliente + ",\nobrigado por criar uma conta em nosso banco,\nseus dados são:\nagência: " + agencia + ", conta: " + conta + "\ne seu saldo: R$ " + String.format("%.2f", saldo) + " já está disponível para saque.");
       
        scanner.close();
    }
}
/*Se o código for pequeno e simples, a primeira solução (scanner.close())
já resolve o problema.
Se for um código maior, usar try-with-resources é mais seguro, pois evita 
esquecer de fechar o Scanner. */