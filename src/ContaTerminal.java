import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o numero da conta: ");
        numeroConta = input.nextInt();
        input.nextLine();
        System.out.print("Digite a agência: ");
        agencia = input.next();
        System.out.print("Digite o seu nome: ");
        nomeCliente = input.next();
        System.out.print("Digite seu saldo: ");
        input.nextLine();
        saldo = input.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numeroConta, saldo);














    }
}