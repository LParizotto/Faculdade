import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraIMC {

    private JPanel painelCalculadora;
    private JTextField txtPeso;
    private JTextField txtAltura;
    private JButton btnCalcular;
    private JLabel lblResultado;
    private JLabel lblCategoria;


    public CalculadoraIMC() {
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double peso = Double.parseDouble(txtPeso.getText());
                double altura = Double.parseDouble(txtAltura.getText());

                if(peso<=0 || altura<=0) {
                    lblResultado.setText("Peso ou Altura invalido");
                }else {

                    double imc = peso / (altura * altura);

                    lblResultado.setText(String.valueOf(imc));

                if(imc < 18.5){
                    lblCategoria.setText("Resultado: Você está com o peso abaixo da média");
                } else if(imc >= 18.5 && imc < 25){
                    lblCategoria.setText("Resultado: O seu peso está normal");
                } else if (imc >= 25 && imc < 30){
                    lblCategoria.setText("Resultado: Você está com sobrepeso");
                } else if (imc >= 30 && imc < 35){
                    lblCategoria.setText("Resultado: Você está com obesidade grau 1");
                } else if (imc >= 35 && imc < 40){
                    lblCategoria.setText("Resultado: Você está com obesidade grau 2");
                }else if (imc >= 40){
                    lblCategoria.setText("Resultado: Você vai morre, vai se tratar");
                }
            }
            }
        });



    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora de IMC");
        frame.setContentPane(new CalculadoraIMC().painelCalculadora);
        frame.pack();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}


