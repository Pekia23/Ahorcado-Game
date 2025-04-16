import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    public void initialize() {

        JLabel Titulo = new JLabel("THE AHORCADO GAME");
        Font FuenteTitulo = new Font("Monospaced", Font.BOLD, 36);
        Titulo.setFont(FuenteTitulo);
        Titulo.setBounds(50, 10, 500, 60);

        ImageIcon imagen = new ImageIcon("Ahorcado/src/img/1x/Recurso_11@1x.png");
        Image Imagen = imagen.getImage(); // Convertimos el ImageIcon a Image
        Image nuevaImagen = Imagen.getScaledInstance(300, 400, java.awt.Image.SCALE_SMOOTH); // Escalamos la imagen al
        ImageIcon nuevoIcono = new ImageIcon(nuevaImagen);
        JLabel imagenPortada = new JLabel(nuevoIcono); // tamaño deseado
        imagenPortada.setBounds(100, 80, 300, 400);

        add(Titulo);
        add(imagenPortada);

        JButton btnLogin = new JButton("Log In");
        Font Fuente = new Font("Monospaced", Font.BOLD, 20);
        btnLogin.setFont(Fuente);
        btnLogin.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                PlayFrame play = new PlayFrame();
                play.Rememberme();
                setVisible(false);
                play.setVisible(true);

            }

        });

        JButton btnRegistre = new JButton("Sign Up");
        btnRegistre.setFont(Fuente);
        btnRegistre.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                RegisterFrame registro = new RegisterFrame();
                registro.Registrame();
                setVisible(false);
                registro.setVisible(true);
            }

        });

        JButton btnRanking = new JButton("Ver Ranking");
        btnRanking.setFont(Fuente);
        btnRanking.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                RankingFrame registro = new RankingFrame();
                registro.RankingVer();
                ;
                setVisible(false);
                registro.setVisible(true);
            }

        });

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(3, 5, 5, 5));
        buttonsPanel.setOpaque(false);
        buttonsPanel.add(btnLogin);
        buttonsPanel.add(btnRegistre);
        buttonsPanel.add(btnRanking);
        buttonsPanel.setBounds(135, 510, 200, 100);
        add(buttonsPanel);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBounds(300, 10, 400, 400);
        mainPanel.setBackground(new Color(125, 125, 125));
        add(mainPanel);

        setTitle("El Ahorcado Game");
        setIconImage(new ImageIcon("Ahorcado/src/img/1x/jugando-videojuegos.png").getImage());
        setBounds(500, 80, 500, 700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
