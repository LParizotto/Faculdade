import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AplicativoDeNotas {

    private JPanel painelPrincipal;
    private JTextField campoNota;
    private JButton btnAdicionarNota;
    private JButton btnCalcularMedia;
    private JTextArea areaNotas;
    private JLabel lblResultado;

    private ArrayList<Double> notas = new ArrayList<>();

    public AplicativoDeNotas() {

        btnAdicionarNota.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoNota = campoNota.getText();

                if (numero(textoNota)) {
                    double nota = Double.parseDouble(textoNota);
                    notas.add(nota);
                    areaNotas.append("Nota: " + nota + "\n");
                    campoNota.setText("");
                }
            }
        });

        btnCalcularMedia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double soma = 0;
                for (double nota : notas) {
                    soma += nota;
                }

                double media = soma / notas.size();

                String status = (media >= 7.0) ? "Aprovado" : "Reprovado";

                lblResultado.setText(String.format("Média:   Status: ", media, status));
            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplicativo de Notas");
        frame.setContentPane(new AplicativoDeNotas().painelPrincipal);
        frame.pack();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}