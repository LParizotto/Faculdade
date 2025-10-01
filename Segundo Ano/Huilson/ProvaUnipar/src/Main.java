import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Qual a quantidade de carros ?");
        int carros = scanner.nextInt();


        double[] notas = new double[carros];
        double somaNota=0;
        int carrosBons =0;
        int carrosRuins =0;

        for(int i = 0; i < carros; i++) {
            System.out.println("Qual a nota do carro " + (i+1) + ":");
            notas[i] = scanner.nextDouble();
            if (notas[i] > 10 || notas[i] < 0){
                System.out.println("Favor inserir uma nota de 0 a 10");
                i--;
            }
        }

        for (int i = 0; i < carros; i++) {
            somaNota += notas[i];
            if (notas[i] >= 6){
                carrosBons++;
            } else if (notas[i] <= 6) {
                carrosRuins++;
            }

        }

        System.out.println("A média foi de " + (somaNota/carros));
        System.out.println("E " + carrosBons + " foram avaliados como bons");
        System.out.println("e " + carrosRuins + " foram avaliados como ruins");
    }
}