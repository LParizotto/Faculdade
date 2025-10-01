import java.util.Scanner;


public class ChatGpt04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = solicitarNumero(scanner);
        String resultado = parOuImpar(numero);

        System.out.println("O número solicitado é: " + resultado);
    }

    public static int solicitarNumero(Scanner scanner) {
        System.out.println("Digite o número desejado: ");
        return scanner.nextInt();
    }

    public static String parOuImpar(int numero) {
        if (numero % 2 == 0) {
            return "Par";
        }else{
            return "Impar";
        }
    }

}
