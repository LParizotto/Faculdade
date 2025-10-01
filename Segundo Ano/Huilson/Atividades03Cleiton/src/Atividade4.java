import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {

        int[] num = new int[3];

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        num[0] = sc.nextInt();

        System.out.print("Digite outro numero: ");
        num[1] = sc.nextInt();

        System.out.print("Digite mais um numero: ");
        num[2] = sc.nextInt();

        System.out.println("Os valor colocados foram: " + num[0] + ", " + num[1] + ", " + num[2]);
        System.out.println("A media dos valores é: " + num[0] + num[1] + num[2] / 3);
    }
}
