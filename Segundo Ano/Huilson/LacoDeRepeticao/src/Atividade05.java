import java.util.Scanner;
import java.util.Random;
public class Atividade05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = 100;
        int numeroSecreto = new Random().nextInt(100);
        while(numero <= 100){
            System.out.println("Tente adivinhar o número de 0 a 100");
            numero = scanner.nextInt();

            if(numero == numeroSecreto){
                System.out.println("Parabéns, você acertou o número!");
                break;
            }else {
                System.out.println("Errou!! Tente mais uma vez");
                numero--;
            }
        }
    }
}