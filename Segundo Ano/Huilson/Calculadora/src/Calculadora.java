import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculadora {

    private JPanel Calculadora;
    private JButton btnZero;
    private JButton btnResultado;
    private JButton btnSubtrair;
    private JButton btnSomar;
    private JButton btnLimpar;
    private JButton btn8;
    private JButton btnMultiplicar;
    private JButton btnDividir;
    private JButton btn9;
    private JButton btn6;
    private JButton btn5;
    private JButton btn7;
    private JButton btn3;
    private JButton btn2;
    private JButton btn1;
    private JButton btn4;
    private JTextField Tela;

    private CalcularOperacao calcularOperacao = new CalcularOperacao();



    public  void mostrar(String texto){
        if(Tela.getText().equals("0")){
            Tela.setText(texto);
        } else {
            Tela.setText(Tela.getText().concat(texto));
        }
    }

    public void limpar(){
        Tela.setText("");
    }

    public static class CalcularOperacao{

    public String operacao;
    public Double total;


    public void escolherOperacao(String operacao, double valor) {
        this.operacao = operacao;
        this.total = valor;
    }

    public double realizarOperacao(double valor){
        if(operacao.equals("SOMA")){
            total+=valor;
        }else if(operacao.equals("SUBTRAIR")){
            total -= valor;
        }else if(operacao.equals("DIVIDIR")){
            total /= valor;
        }else if(operacao.equals("MULTIPLICAR")){
            total *= valor;
        }
        return total;
    }

    public Double pegarTotal(){
        return this.total;
        }

    }



    public Calculadora(){

        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpar();
            }
        });

        btnSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double primeiroValor = Double.parseDouble(Tela.getText());
                calcularOperacao.escolherOperacao("SOMA", primeiroValor);
                Tela.setText("");

            }
        });

        btnSubtrair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double primeiroValor = Double.parseDouble(Tela.getText());
                calcularOperacao.escolherOperacao("SUBTRAIR", primeiroValor);
                Tela.setText("");

            }
        });

        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double primeiroValor = Double.parseDouble(Tela.getText());
                calcularOperacao.escolherOperacao("DIVIDIR", primeiroValor);
                Tela.setText("");

            }
        });

        btnMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double primeiroValor = Double.parseDouble(Tela.getText());
                calcularOperacao.escolherOperacao("MULTIPLICAR", primeiroValor);
                Tela.setText("");
            }
        });

        btnResultado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            double primeiroValor = Double.parseDouble(Tela.getText());
            double resultado = calcularOperacao.realizarOperacao(primeiroValor);

            Tela.setText("" + resultado);

            }
        });



        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrar("0");
            }
        });

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrar("1");
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrar("2");
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrar("3");
            }
        });

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrar("4");
            }
        });

        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrar("5");
            }
        });

        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrar("6");
            }
        });

        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrar("7");
            }
        });

        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrar("8");
            }
        });

        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrar("9");
            }
        });



    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("calculadora");
        frame.setContentPane(new Calculadora().Calculadora);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(300,400);
    }
}
