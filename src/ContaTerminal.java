import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Prezado Cliente, digite o numero da sua conta: ");
        int conta = sc.nextInt();

        System.out.println("Prezado Cliente, digite o numero da sua agencia: ");
        String agencia = sc.next();

        System.out.println("Prezado Cliente, digite seu nome: ");
        String nome = sc.next();

        System.out.println("Prezado Cliente, digite o saldo da sua conta: ");
        double saldo = sc.nextDouble();

        System.out.println("Sr(a) " + nome + ", Seja bem vindo a nosso banco, o numero da sua conta é " + conta + ", o numero da sua agencia é " + agencia +
                " e o saldo é "+ saldo );

    }
}
