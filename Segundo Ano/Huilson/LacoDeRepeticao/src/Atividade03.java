import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();
        int fatorial = numero;

        do{fatorial = fatorial*(numero -1);
            numero--;

        } while(numero > 1);


        System.out.println(fatorial);



    }
}
