public class Main {
    public static void main(String[] args) {

        int primeiroNumero = 20;
        int segundoNumero = 10;

        int soma = primeiroNumero + segundoNumero;
        int subtracao = primeiroNumero - segundoNumero;
        int multiplicacao = primeiroNumero * segundoNumero;
        int divisao = primeiroNumero / segundoNumero;


        Main minhaClase;
        int somaViaFuncao = somarValores(primeiroNumero, segundoNumero);
        System.out.println("Valor soma " + somaViaFuncao);
        int subtrairViaFuncao = subtrairValores(primeiroNumero, segundoNumero);
        System.out.println("Subtrair função " + subtrairViaFuncao);
        int multiplicarViaFuncao = multiplicarValores(primeiroNumero, segundoNumero);
        System.out.println("Multiplicação função " + multiplicarViaFuncao);
        int dividirViaFuncao = dividirValores(primeiroNumero, segundoNumero);
        System.out.println("Divisão função " + dividirViaFuncao);
    }
    public static int somarValores(int numA, int numB){
        return numA + numB;
    }

    public static int subtrairValores(int numA, int numB){
        if(numA < 0){

            numA = numA * -1;
        }
        return numA-numB;
    }

    public static int multiplicarValores(int numA, int numB) {

        return numA * numB;
    }

    public static int dividirValores(int numA, int numB) {

        return numA / numB;
    }

}