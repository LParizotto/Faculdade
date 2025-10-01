import java.util.Scanner;


public class ChatpGpt03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temperatura = soliticarTemperatura(scanner);
        double convertida = conversorTemperatura(temperatura);

        System.out.println("A temperatura em F é: " + convertida);

    }

    public static double soliticarTemperatura(Scanner scanner) {
        System.out.println("Digite a temperatura em Celsius: ");
        return scanner.nextDouble();
    }

    public static double conversorTemperatura(double temperatura) {
        return (temperatura * 9/5) + 32;
    }
}
