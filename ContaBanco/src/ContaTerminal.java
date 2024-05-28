import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(new Locale("pt", "BR"));

        System.out.println("Por favor, digite o número de conta!");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da agência!");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente!");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o saldo!");
        String saldoString = scanner.nextLine().replace(',', '.');
        Double saldo = Double.parseDouble(saldoString);

        String mensagem = "Olá ".concat(nome)
                            .concat(", obrigado por criar uma conta em nosso banco. Sua agência é ")
                            .concat(agencia)
                            .concat(", conta ")
                            .concat(String.valueOf(numero))
                            .concat(" e seu saldo ")
                            .concat(String.format("%.2f", saldo))
                            .concat(" já está disponível para saque.");
        System.out.println(mensagem);

        scanner.close();
    }
}