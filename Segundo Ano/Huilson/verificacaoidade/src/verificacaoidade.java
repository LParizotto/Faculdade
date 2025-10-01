import java.util.Scanner;

public class verificacaoidade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        double idade = sc.nextDouble();

        if (idade >= 18) {
            System.out.println("É maior de idade!");
        } else if (idade < 18) {
            System.out.print("É menor de idade");
        }

    }

}
