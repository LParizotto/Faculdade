public class Atividade3 {
    public static void main(String[] args) {

        int[] numeros = new int[2];
        numeros[0] = 5;
        numeros[1] = 10;

        System.out.println(numeros[0] + " " + " " + numeros[1]);

        int troca = numeros[0];
        numeros[0] = numeros[1];
        numeros[1] = troca;

        System.out.println(numeros[0] + " " + " " + numeros[1]);
    }
}
