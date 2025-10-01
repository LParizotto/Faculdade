import java.util.Scanner;

public class Atividade06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros desejada: ");
        int num = sc.nextInt();
        double soma = 0;


        for(int i = 0; i < num; i++){

            System.out.println("Coloque os números: ");
            double numero = sc.nextDouble();
            soma += numero;
        }

        double media = soma / num;

        System.out.println("A média dos números colocados é: " + media);

    }
}
