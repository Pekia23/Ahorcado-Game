import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JFrame {
    int intentos = 6;
    String palabraAdivinada = "";
    String palabraSecreta = getSecretWord();
    int puntaje = 0;
    private JLabel label1, label2, label3, label4, label5, label6, label7;

    public void Interface(String apodo) {
        JLabel Titulo = new JLabel("THE AHORCADO GAME");
        Font FuenteTitulo = new Font("Monospaced", Font.BOLD, 40);
        Titulo.setFont(FuenteTitulo);
        Titulo.setBounds(175, 10, 500, 60);
        add(Titulo);

        ImageIcon imagen2 = new ImageIcon("Ahorcado/src/img/1x/Recurso_5@1x.png");
        ImageIcon imagen3 = new ImageIcon("Ahorcado/src/img/1x/Recurso_7@1x.png");
        ImageIcon imagen4 = new ImageIcon("Ahorcado/src/img/1x/Recurso_8@1x.png");
        ImageIcon imagen5 = new ImageIcon("Ahorcado/src/img/1x/Recurso_9@1x.png");
        ImageIcon imagen6 = new ImageIcon("Ahorcado/src/img/1x/Recurso_10@1x.png");
        ImageIcon imagen7 = new ImageIcon("Ahorcado/src/img/1x/Recurso_11@1x.png");

        ImageIcon imagen = new ImageIcon("Ahorcado/src/img/1x/Recurso_4@1x.png");
        Image Imagen = imagen.getImage();
        Image nuevImage = Imagen.getScaledInstance(300, 400, java.awt.Image.SCALE_SMOOTH);
        ImageIcon nuevoIcono = new ImageIcon(nuevImage);
        label1 = new JLabel(nuevoIcono);
        label1.setBounds(500, 100, 400, 400);
        add(label1);

        Image Imagen2 = imagen2.getImage();
        Image nuevImage2 = Imagen2.getScaledInstance(300, 400, java.awt.Image.SCALE_SMOOTH);
        ImageIcon nuevoIcono2 = new ImageIcon(nuevImage2);
        label2 = new JLabel(nuevoIcono2);
        label2.setBounds(500, 100, 400, 400);
        add(label2);
        label2.setVisible(false);

        Image Imagen3 = imagen3.getImage();
        Image nuevImage3 = Imagen3.getScaledInstance(300, 400, java.awt.Image.SCALE_SMOOTH);
        ImageIcon nuevoIcono3 = new ImageIcon(nuevImage3);
        label3 = new JLabel(nuevoIcono3);
        label3.setBounds(500, 100, 400, 400);
        add(label3);
        label3.setVisible(false);

        Image Imagen4 = imagen4.getImage();
        Image nuevImage4 = Imagen4.getScaledInstance(300, 400, java.awt.Image.SCALE_SMOOTH);
        ImageIcon nuevoIcono4 = new ImageIcon(nuevImage4);
        label4 = new JLabel(nuevoIcono4);
        label4.setBounds(500, 100, 400, 400);
        add(label4);
        label4.setVisible(false);

        Image Imagen5 = imagen5.getImage();
        Image nuevImage5 = Imagen5.getScaledInstance(300, 400, java.awt.Image.SCALE_SMOOTH);
        ImageIcon nuevoIcono5 = new ImageIcon(nuevImage5);
        label5 = new JLabel(nuevoIcono5);
        label5.setBounds(500, 100, 400, 400);
        add(label5);
        label5.setVisible(false);

        Image Imagen6 = imagen6.getImage();
        Image nuevImage6 = Imagen6.getScaledInstance(300, 400, java.awt.Image.SCALE_SMOOTH);
        ImageIcon nuevoIcono6 = new ImageIcon(nuevImage6);
        label6 = new JLabel(nuevoIcono6);
        label6.setBounds(500, 100, 400, 400);
        add(label6);
        label6.setVisible(false);

        Image Imagen7 = imagen7.getImage();
        Image nuevImage7 = Imagen7.getScaledInstance(300, 400, java.awt.Image.SCALE_SMOOTH);
        ImageIcon nuevoIcono7 = new ImageIcon(nuevImage7);
        label7 = new JLabel(nuevoIcono7);
        label7.setBounds(500, 100, 400, 400);
        add(label7);
        label7.setVisible(false);

        Font Fuente = new Font("Monospaced", Font.BOLD, 25);
        setFont(Fuente);

        System.out.println(palabraSecreta);
        JLabel palabraLabel = new JLabel();
        JLabel intentosLabel = new JLabel();
        JLabel puntajeLabel = new JLabel();
        JTextField letraTextField = new JTextField(1);
        letraTextField.setFont(Fuente);
        JButton btnAdivinar = new JButton("Intentar");
        btnAdivinar.setFont(Fuente);
        btnAdivinar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

                if (e.getSource() == btnAdivinar) {
                    String letraIngresada = letraTextField.getText().toLowerCase();
                    if (letraIngresada.length() == 1) {
                        char letra = letraIngresada.charAt(0);
                        boolean letraAdivinada = false;
                        StringBuilder palabraAdivinadaBuilder = new StringBuilder(palabraAdivinada);
                        for (int i = 0; i < palabraSecreta.length(); i++) {
                            if (palabraSecreta.charAt(i) == letra) {
                                palabraAdivinadaBuilder.setCharAt(i, letra);
                                letraAdivinada = true;
                                puntaje += 100;
                                puntajeLabel.setText("puntaje: " + puntaje + " puntos");
                            }
                        }
                        palabraAdivinada = palabraAdivinadaBuilder.toString();

                        palabraLabel.setText(palabraAdivinada);
                        if (!letraAdivinada) {
                            --intentos;
                            puntaje -= 50;
                            intentosLabel.setText("Intentos: " + intentos);
                            if (intentos == 5) {
                                label1.setVisible(false);
                                label2.setVisible(true);
                            } else if (intentos == 4) {
                                label2.setVisible(false);
                                label3.setVisible(true);
                            } else if (intentos == 3) {
                                label3.setVisible(false);
                                label4.setVisible(true);
                            } else if (intentos == 2) {
                                label4.setVisible(false);
                                label5.setVisible(true);
                            } else if (intentos == 1) {
                                label5.setVisible(false);
                                label6.setVisible(true);
                            }
                            if (puntaje < 0) {
                                puntaje = 0;
                                puntajeLabel.setText("puntaje: " + puntaje + " puntos");
                            }
                            puntajeLabel.setText("puntaje: " + puntaje + " puntos");
                        }
                        letraTextField.setText("");
                        if (palabraAdivinada.equals(palabraSecreta)) {
                            JOptionPane.showMessageDialog(null, "¡Ganaste! :D Con un puntaje: " + puntaje + " puntos");
                            Data.UpdateJugador(puntaje, apodo);
                            Data.UpdateData(puntaje, apodo, palabraSecreta, 1);
                            MainFrame play = new MainFrame();
                            play.initialize();
                            setVisible(false);
                            play.setVisible(true);
                        } else if (intentos == 0) {
                            label6.setVisible(false);
                            label7.setVisible(true);
                            JOptionPane.showMessageDialog(null, "¡Perdiste! La palabra secreta era: " + palabraSecreta);
                            Data.UpdateJugador(puntaje, apodo);
                            Data.UpdateData(puntaje, apodo, palabraSecreta, 2);
                            MainFrame play = new MainFrame();
                            play.initialize();
                            setVisible(false);
                            play.setVisible(true);
                        } else if (intentos < 0) {
                            intentos = 0;
                            intentosLabel.setText("Intentos: " + intentos);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingresa solo una letra", "ERROR ",
                                JOptionPane.WARNING_MESSAGE);
                        letraTextField.setText("");
                    }
                }
            }
        });
        palabraAdivinada = "";
        for (int i = 0; i < palabraSecreta.length(); i++) {
            palabraAdivinada += "_";
        }
        palabraLabel.setText(palabraAdivinada);
        palabraLabel.setFont(FuenteTitulo);
        intentosLabel.setText("Intentos: " + intentos);
        puntajeLabel.setText("puntaje: " + puntaje + " puntos");
        intentosLabel.setFont(Fuente);
        puntajeLabel.setFont(Fuente);

        JLabel palabra = new JLabel("La Palabra es...");
        JLabel nota = new JLabel("Para los espacio usar _");

        palabra.setBounds(50, 100, 500, 150);
        palabra.setFont(Fuente);
        add(palabra);
        palabraLabel.setBounds(50, 175, 500, 150);
        add(palabraLabel);
        intentosLabel.setBounds(50, 50, 200, 150);
        add(intentosLabel);
        puntajeLabel.setBounds(250, 50, 300, 150);
        add(puntajeLabel);
        letraTextField.setBounds(50, 300, 250, 50);
        add(letraTextField);
        nota.setBounds(50, 280, 500, 150);
        Font Fuente1 = new Font("Monospaced", Font.BOLD, 10);
        nota.setFont(Fuente1);
        add(nota);
        btnAdivinar.setBounds(50, 375, 200, 50);
        add(btnAdivinar);

        JPanel PlayPanel = new JPanel();
        PlayPanel.setLayout(new BorderLayout());
        PlayPanel.setBounds(1000, 10, 400, 400);
        PlayPanel.setBackground(new Color(125, 125, 125));
        add(PlayPanel);

        setTitle("The Ahorcado Game");
        setIconImage(new ImageIcon("Ahorcado/src/img/1x/jugando-videojuegos.png").getImage());
        setBounds(350, 60, 900, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

    }

    static String getSecretWord() {
        String[] word = Data.ConsultaPalabra();
        Random r = new Random();
        int n = r.nextInt(word.length);
        return word[n];
    }

    static char[] getGuionesFromPalabra(String word) {
        int NumeroLetras = Data.CantidadLetras(word);
        char[] palabraGuion = new char[NumeroLetras];

        for (int i = 0; i < palabraGuion.length; i++) {
            palabraGuion[i] = '_';
        }
        return palabraGuion;
    }

    static boolean hayGuiones(char[] array) {
        for (char l : array) {
            if (l == '_')
                return true;
        }
        return false;
    }
}
