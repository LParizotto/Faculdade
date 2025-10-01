import java.util.Scanner;

public class ChatGpt02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = solicitarNumero(scanner);
        int quadrado = calcularaQuadrado(numero);


        System.out.println("O quadrado do número solicitado é: " + quadrado);
    }

    public static int solicitarNumero(Scanner scanner) {
        System.out.println("Digite o número desejado: ");
        return scanner.nextInt();
    }

    public static int calcularaQuadrado(int numero) {
        return numero * numero;
    }
}

