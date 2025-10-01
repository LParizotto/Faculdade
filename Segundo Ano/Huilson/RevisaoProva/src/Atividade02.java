import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de pessoas desejadas: ");
        int pessoas = sc.nextInt();

        int maisVelho = 0;
        int maisNovo = 100;
        int maiorDeIdade = 0;
        int menorDeIdade = 0;

        for (int i = 0; i < pessoas; i++) {
            System.out.println("Digite a idade da pessoa " + (i+1) + ": ");
            int idade = sc.nextInt();

            if (idade > maisVelho) {
                maisVelho = idade;
            }else if (idade < maisNovo) {
                maisNovo = idade;
            }
            if (idade >= 18) {
                maiorDeIdade++;
            }else{
                menorDeIdade++;
            }
        }

        System.out.println("O mais velho foi: " + maisVelho);
        System.out.println("O mais novo foi: " + maisNovo);
        System.out.println("Menores de Idade: " + menorDeIdade);
        System.out.println("Maiores de Idade: " + maiorDeIdade);
    }
}
