import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        int numero;
        System.out.println("Digite um numero: ");
        numero = sc.nextInt();

        while (numero != 0) {
                System.out.println(numero - 1);
                Thread.sleep(500);
                numero--;
        }
    }
}
