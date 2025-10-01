public class Main {
    public static void main(String[] args) {

        System.out.println("Luis");

        //TipoDaVariavel nomeDaVariavel = valorDaVariavel
        //String é um TEXTO
        String nome = "Luis";
        char sexo = 'M';

        //[] -> Diz que é um array
        //{} -> Indicar um objeto
        char[] textoChar = {'5'};

        //Guardar valores Reais
        double altura = 1.69;
        Double peso = 60.0;
        float alturaPessoa2 = 1.80f;
        Float alturaPessoa3 = 1.83f;

        //Guardar valores inteiros
        int numeroCasa = 20;
        Integer numeroAlunos = 75;
        Long numeroGolsDoBraitWaith= 3l;

        //Operadores Aritmeticos
        // + para soma
        // - para subtração
        // * para multiplicação
        // / para divisão

        Integer soma = 5 + 5;
        Integer subtração = 5 - 2;
        Integer multiplicar = 5 * 5;
        Integer dividir = 5 / 5;

        Integer resultadoSoma = soma + subtração;
        Integer resultadoSubtrair = soma - subtração;
        Integer resultadoMultiplicar = soma * subtração;
        Integer resultadoDivisao = soma / subtração;

        System.out.println("Valor da divisão é:" + resultadoDivisao);
        System.out.println("Valor da multiplicação é:" + resultadoMultiplicar);
        System.out.println("Valor da soma é:" + resultadoSoma);
        System.out.println("Valor da subtração é:" + resultadoSubtrair);



    }
}