import java.util.Scanner;


public class ChatGpt05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1 = primeiroNumero(scanner);
        int numero2 = segundoNumero(scanner);

        int soma = somarNumeros(numero1, numero2);
        System.out.println("A soma é: " + soma);
    }

    public static int primeiroNumero(Scanner scanner) {
        System.out.println("Digite o primeiro número: ");
        return scanner.nextInt();
    }
    public static int segundoNumero(Scanner scanner) {
        System.out.println("Digite o segundo número: ");
        return scanner.nextInt();
    }

    public static int somarNumeros(int numero1, int numero2) {
        return numero1 + numero2;
    }
}