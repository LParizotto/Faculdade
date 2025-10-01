import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int i;
        System.out.println("Digite um numero: ");
        numero = sc.nextInt();


        //inicialização; condição; incremento

        for (i = 0; i <= 10; i++) {
            System.out.println(numero * i);
        }
    }
}