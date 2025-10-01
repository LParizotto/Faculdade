import java.util.Scanner;


public class DescontoProgressivo {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        double valorCompra;
        System.out.println("Digite o valor total da compra: ");
        valorCompra = sc.nextDouble();

        double desconto = 0.0;

        if(valorCompra > 500){
            desconto = 0.20;
        }
        else if(valorCompra  >= 200 && valorCompra < 500){
            desconto = 0.10;
        }
		else if(valorCompra >= 100 && valorCompra < 199.99){
            desconto = 0.05;
        }


        double valorDesconto = valorCompra * desconto;
        double valorFinal = valorCompra - valorDesconto;

        System.out.printf("Valor original do produto: R$ %.2f%n", valorCompra);
        System.out.println("Desconto aplicado: %" + desconto * 100);
        System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Valor final com desconto: R$ %.2f%n", valorFinal);



    }
    }

