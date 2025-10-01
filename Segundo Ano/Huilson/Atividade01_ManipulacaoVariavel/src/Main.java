public class Main {
    public static void main(String[] args) {

        //Criação de variáveis
        int idadepessoa = 18;
        Integer alturapessoa = 170;
        String nome = "Luís";
        boolean estudante = true;

        //Operação simples
        Integer somaidades = idadepessoa + idadepessoa;
        Integer mutiplicacaoA = alturapessoa * 2;
        String saudacao = "Olá," + nome;

        //Exibição Resultados
        System.out.println(saudacao);

        System.out.println("Idade: " + idadepessoa);
        System.out.println("Altura: " + alturapessoa + " cm");
        System.out.println("Nome: " + nome);
        System.out.println("É estudante: " + estudante);

        System.out.println("Soma das idades: " +somaidades);
        System.out.println("Altura dobrada: " + mutiplicacaoA + " cm");

        }
}