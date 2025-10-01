import java.util.Scanner;

public class PositivoNegativoOuZero {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        double numero;
        System.out.println("Digite um número: ");
        numero = sc.nextDouble();

        if(numero > 0){
            System.out.println("É positivo!");
        }
        else if(numero < 0){
            System.out.println("É negativo!");
        }
        else{
            System.out.println("O número é 0.");
        }



    }
}

