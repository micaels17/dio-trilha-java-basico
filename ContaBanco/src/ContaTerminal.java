import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Por favor, digite o número da Agência:");
            int agencia = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer do scanner
            
            System.out.println("Por favor, digite o nome do Cliente:");
            String nomeCliente = scanner.nextLine();
            
            System.out.println("Por favor, digite o número da Conta:");
            int numero = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer do scanner
            
            System.out.println("Por favor, digite o Saldo:");
            double saldo = scanner.nextDouble();
            scanner.nextLine(); // Limpar buffer do scanner
            
            String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + "-" + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
            System.out.println(mensagem);
        }
    }
}