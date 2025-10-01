import java.util.Scanner;

public class atividade01 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.println("Digite a quantidade de alunos desejada: ");
         int alunos = sc.nextInt();

         double[] notas = new double[alunos];
         int alunosAprovados = 0;
         int alunosReprovados = 0;
         double somaNotas = 0;

         for (int i = 0; i < alunos; i++) {
             System.out.println("Digite a nota do aluno " + (i + 1) + ": ");
             notas[i] = sc.nextDouble();


             if (notas[i] < 0 || notas[i] > 10){
                 System.out.println("Digigte um valor válido, entre 0 e 10, tente novamente");
                 return;
             }

             somaNotas += notas[i];

             if (notas[i] < 6) {
                 alunosReprovados++;
             }else{
                 alunosAprovados++;
             }
         }
         double mediaNotas = somaNotas / alunos;

         System.out.println("Total de alunos aprovados: " + alunosAprovados);
         System.out.println("Total de alunos reprovados: " + alunosReprovados);
         System.out.println("A media das notas foi: " + mediaNotas);
    }
}
