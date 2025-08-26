import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {

    private JTextField txtPrimeirValor;

    private JTextField txtSegundoValor;

    private JButton btnSomar;

    private JTextField txtResultado;

    private JButton btnLimpar;

    private JPanel panelMain;


    public Calculadora() {

        btnSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Peguei informação da tela
                Integer primeiro = Integer.valueOf(txtPrimeirValor.getText());
                Integer segundo = Integer.valueOf(txtSegundoValor.getText());

                //Processei
                Integer soma = primeiro + segundo;

                //Mandei pra tela o resultado
                txtResultado.setText(soma.toString());


            }
        });


    }


    public static void main(String[] args) {

        JFrame frame = new JFrame("Minha calculadora");
        frame.setContentPane(new Calculadora().panelMain);
        frame.setSize(400,400);
        frame.setVisible(true);


    }
}
