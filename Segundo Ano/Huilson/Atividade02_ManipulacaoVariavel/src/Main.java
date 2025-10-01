public class Main {
    public static void main(String[] args) {

        //Declaração
        String nome = "Luís";
        int idade = 18;
        Integer salario = 3000;
        int mesestrabalhados = 10;
        int produtoscomprados = 15;

        //Operações
        Integer bruto = salario * mesestrabalhados;
        Integer liquido = bruto - 1500;
        int gastos = liquido / produtoscomprados;
        String info = "Nome do trabalhador: " + nome + " \nSalário líquido: " + liquido;

        //Resultados
        System.out.println(info);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Meses trabalhados: " + mesestrabalhados);
        System.out.println("Produtos comprados: " + produtoscomprados);

        System.out.println("Salário bruto: " + bruto);
        System.out.println("Salário líquido: " + liquido);
        System.out.println("Gastos: " + gastos);

    }
}