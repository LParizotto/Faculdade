import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for(double idade = 0; idade <= 0;) {

            System.out.println("Digite a sua idade");
            idade = sc.nextInt();
            if(idade > 0) {
                System.out.println("Obrigado por ajudar");
                break;}

            else{System.out.println("Coloque uma idade valida");}
        }
    }
}
