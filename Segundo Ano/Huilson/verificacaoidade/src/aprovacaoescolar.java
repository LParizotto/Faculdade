import java.util.Scanner;


public class aprovacaoescolar {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva a sua média final");
        short media = sc.nextShort();

        if (media >= 7){
            System.out.println("Aprovado!");
        }
        else if (media >= 5){
            System.out.println("Recuperação");
        }
		else{
            System.out.println("Reprovado");
        }


    }
}

