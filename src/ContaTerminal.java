import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Prezado Cliente, digite o numero da sua conta: ");
        int numero = sc.nextInt();

        System.out.println("Prezado Cliente, digite o numero da sua agencia: ");
        String agencia = sc.nextLine();

        System.out.println("Prezado Cliente, digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Prezado Cliente, digite o saldo da sua conta: ");
        double saldo = sc.nextDouble();



    }
}
