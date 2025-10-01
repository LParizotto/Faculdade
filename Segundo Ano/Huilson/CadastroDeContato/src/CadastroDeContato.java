import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroDeContato {

    //PAINEL
    private JPanel CadastroDeContatos;

    //CAMPOS PARA PREENCHER
    private JTextField txtNome;
    private JTextField txtNumero;
    private JTextField txtEmail;

    //BOTOES
    private JButton btnRemover;
    private JButton btnAdicionar;

    //LISTA DE CONTATOS
    private JList listContatos;



    DefaultListModel<String> lista = new DefaultListModel<>();

    public CadastroDeContato() {

        listContatos.setModel(lista);

        btnAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoNome = txtNome.getText();
                String textoNumero = txtNumero.getText();
                String textoEmail = txtEmail.getText();

                String mostrarContato = textoNome + "        " + textoNumero + "       " + textoEmail;

                lista.addElement(mostrarContato);

                txtNome.setText("Nome: ");

                txtNumero.setText("Numero: ");

                txtEmail.setText("Email: ");
            }
        });

        btnRemover.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (lista.getSize() > 0) {
                    int excluirContato = lista.getSize() - 1;
                    lista.removeElementAt(excluirContato);
                }

            }
        });
    }

            public static void main(String[] args) {
                JFrame frame = new JFrame("Cadastro de Contatos");
                frame.setContentPane(new CadastroDeContato().CadastroDeContatos);
                frame.pack();
                frame.setSize(600, 300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        }