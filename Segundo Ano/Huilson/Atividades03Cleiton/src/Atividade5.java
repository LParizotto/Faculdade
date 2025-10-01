import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {

        String[] nome = new String[3];

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um nome: ");
        nome[0] = sc.nextLine();
        System.out.println("Digite outro nome: ");
        nome[1] = sc.nextLine();
        System.out.println("Digite mais um nome: ");
        nome[2] = sc.nextLine();

        System.out.println("Os nomes inseridos são: " + nome[0] + " " + nome[1] + " " + nome[2]);

    }
}
