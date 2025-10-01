public class Main {

    public static void main(String[] args) {

        Taffe taffe = new Taffe();

        String fala = taffe.dizerOi();
        System.out.println(fala);

        taffe.falar("Gremio melhor que inter");
        taffe.falar("Aprendendo Classes");

        taffe.andar(10,true);
        taffe.andar(10, true);
        taffe.andar(5, false);
        taffe.retornarPosicao();



        Taffe patrick = new Taffe();
        patrick.andar(10, true);
        patrick.andar(4, false);
        patrick.retornarPosicao();
    }
}