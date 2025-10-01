public class Main {
    public static void main(String[] args) {

        //Declaração de variáveis
        String nome = "Corona";
        double precouni = 10.00;
        int quantidadeComprada = 6;
        double imposto = 0.2;
        double lucroDesejado = 0.2;

        //Operações
        double valorSemImposto = precouni * quantidadeComprada;
        double valorDoImposto = valorSemImposto * 0.2;
        double valorTotal = valorDoImposto + valorSemImposto;
        double margemLucro = 1 - lucroDesejado;
        double precoVenda = valorTotal / margemLucro;

        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço único: " + precouni);
        System.out.println("Quantidade comprada: " + quantidadeComprada);
        System.out.println("Imposto: " + imposto);
        System.out.println("Lucro desejado: " + lucroDesejado);

        System.out.println("Valor sem imposto: " + valorSemImposto);
        System.out.println("Valor do imposto: " + valorDoImposto);
        System.out.println("Valor total de venda: " + valorTotal);
        System.out.println("Margem de lucro desejado: " + margemLucro);
        System.out.println("Valor de venda com margem de lucro desejada: " + precoVenda);

    }
}