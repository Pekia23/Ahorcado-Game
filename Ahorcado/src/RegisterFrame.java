import javax.swing.JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterFrame extends JFrame {
    JTextField tfApodo;

    public void Registrame() {

        JLabel Titulo = new JLabel("SIGN UP");
        Font FuenteTitulo = new Font("Monospaced", Font.BOLD, 36);
        Titulo.setFont(FuenteTitulo);
        Titulo.setBounds(175, 10, 500, 60);
        add(Titulo);
        JLabel lbApodo = new JLabel("Apodo");
        Font Fuente = new Font("Monospaced", Font.BOLD, 25);
        lbApodo.setFont(Fuente);
        tfApodo = new JTextField();
        tfApodo.setFont(Fuente);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 1, 5, 6));
        formPanel.setOpaque(false);
        formPanel.add(lbApodo);
        formPanel.add(tfApodo);
        formPanel.setBounds(40, 85, 400, 150);
        add(formPanel);

        JButton btnPlay = new JButton("Play");
        btnPlay.setFont(Fuente);
        btnPlay.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                String apodo = tfApodo.getText();
                Boolean x = Data.ConsultarApodo(apodo);

                if (x == true) {
                    Data.AgregarJugador(apodo);
                    GameFrame play = new GameFrame();
                    play.Interface(apodo);
                    setVisible(false);
                    play.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, " Ya existe el apodo " + apodo + ", escoge otro", "ERROR ",
                            JOptionPane.ERROR_MESSAGE);
                    tfApodo.setText("");
                }

            }

        });

        JButton btnBack = new JButton("Back");
        btnBack.setFont(Fuente);
        btnBack.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                MainFrame play = new MainFrame();
                play.initialize();
                setVisible(false);
                play.setVisible(true);

            }

        });

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 5, 5, 5));
        buttonsPanel.setOpaque(false);
        buttonsPanel.add(btnPlay);
        buttonsPanel.add(btnBack);
        buttonsPanel.setBounds(150, 180, 200, 50);
        add(buttonsPanel);

        JPanel PlayPanel = new JPanel();
        PlayPanel.setLayout(new BorderLayout());
        PlayPanel.setBounds(300, 10, 400, 400);
        PlayPanel.setBackground(new Color(125, 125, 125));
        // mainPanel.add(buttonsPanel, BorderLayout.SOUTH);
        add(PlayPanel);

        setTitle("Sign Up");
        setIconImage(new ImageIcon("Ahorcado/src/img/1x/jugando-videojuegos.png").getImage());
        setBounds(500, 250, 500, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
