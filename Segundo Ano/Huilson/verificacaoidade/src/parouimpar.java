import java.util.Scanner;

public class parouimpar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Digite um valor: ");
        n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Par");
        }else if (n % 2 == 1){
            System.out.println("Impar");
        }
    }
}
