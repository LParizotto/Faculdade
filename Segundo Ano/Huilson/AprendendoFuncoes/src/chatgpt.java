public class chatgpt {
    public static void main(String[] args) {
        double temperatura = 100;
        char escala = 'C'; // 'C' para Celsius ou 'F' para Fahrenheit
        converterTemperatura(temperatura, escala);

    }

    public static void  converterTemperatura(double temperatura, char escala) {
        double temperaturaConvertida = 0;
        if (escala == 'C') {
            temperaturaConvertida = (temperatura * 9/5) + 32;
            System.out.println(temperatura + " graus Celsius é igual a " + temperaturaConvertida + " graus Fahrenheit.");
        } else if (escala == 'F') {
            temperaturaConvertida = (temperatura - 32) * 5/9;
            System.out.println(temperatura + " graus Fahrenheit é igual a " + temperaturaConvertida + " graus Celsius.");
        } else {
            System.out.println("Escala de temperatura inválida.");
        }
    }


}