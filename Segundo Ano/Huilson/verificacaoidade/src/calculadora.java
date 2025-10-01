import java.util.Scanner;


public class calculadora {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;
        char operacao;
        double resultado;

        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        num2 = sc.nextDouble();
        System.out.println("Qual operação deseja fazer? (+, -, * ou /): ");
        operacao = sc.next().charAt(0);

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                System.out.println("O resultado da soma é: " + resultado);
                break;

            case '-':
                resultado = num1 - num2;
                System.out.println("O resultado da subtração é: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("O resultado da multiplicação é: " + resultado);
                break;
            case '/':
                resultado = num1 / num2;
                System.out.println("O resultado da divisão é: " + resultado);
                break;

            default:
                System.out.println("Operação é invalida, inserir +, -, * ou /.");
                break;
        }




    }
}
