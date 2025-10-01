import java.util.Scanner;


public class temperatura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double temp;
        System.out.println("Digite a temperatura em graus Celsius: ");
        temp = sc.nextDouble();

        if (temp >= 30) {
            System.out.println("Quente!");
        } else if (temp >= 15) {
            System.out.println("Agradável");
        } else {
            System.out.println("Frio");
        }


    }
}
