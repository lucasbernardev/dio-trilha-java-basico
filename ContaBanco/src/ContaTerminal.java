import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o Nome: ");
        String nome = scanner.next();

        System.out.println("Por favor, digite o Sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite o número da Agencia: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta: ");
        int conta = scanner.nextInt();

        System.out.println("Por favor, deposite um valor : ");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + " conta: " + conta + " e seu saldo: " + saldo + " já está disponivel para saque. ");
    }
}

