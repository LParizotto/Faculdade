import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de alunos desejada: ");
        int quant = sc.nextInt();

        double[] notas = new double[quant];
        int alunosAprovados = 0;
        int alunosReprovados = 0;
        double somaNotas = 0;

        for (int i = 0; i < quant; i++) {
            System.out.print("Digite a nota do aluno" + (i + 1) + ": ");
            double nota = sc.nextDouble();

            if(nota < 0 || nota >10){
                System.out.println("Coloque uma nota de 0 a 10");
                i--;

            }else{
                notas[i] = nota;
                somaNotas += nota;

            }
            if(nota < 6){
                alunosReprovados++;
            }else{
                alunosAprovados++;
            }
        }

        double mediaNotas = somaNotas / quant;

        System.out.println("Alunos aprovados: " + alunosAprovados);
        System.out.println("Alunos reprovados: " + alunosReprovados);
        System.out.println("Media notas: " + mediaNotas);

    }
}