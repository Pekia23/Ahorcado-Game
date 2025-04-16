import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class RankingFrame extends JFrame {
    public void RankingVer() {

        JLabel Titulo = new JLabel("THE RANKING ");
        Font FuenteTitulo = new Font("Monospaced", Font.BOLD, 36);
        Titulo.setFont(FuenteTitulo);
        Titulo.setBounds(125, 10, 300, 60);
        add(Titulo);

        Font Fuente = new Font("Monospaced", Font.BOLD, 25);

        try {
            Connection conex = null;
            conex = Data.Conexion();
            PreparedStatement ps;
            ResultSet res;
            ps = conex.prepareStatement("SELECT jugador.apodo, jugador.puntaje FROM jugador order by puntaje DESC");
            res = ps.executeQuery();
            int i = 0;
            String[] apodo = new String[5];
            String[] puntaje = new String[5];
            while (res.next() && i < 5) {
                apodo[i] = res.getString("jugador.apodo");
                puntaje[i] = String.valueOf(res.getInt("jugador.puntaje"));
                i++;
            }

            String[][] datos = new String[5][2];
            for (int x = 0; x < 5; x++) {
                datos[x][0] = apodo[x];
                datos[x][1] = puntaje[x];
            }

            String[] nombresColumnas = { "Apodo", "Puntaje" };

            // Crear un modelo de tabla con los datos y los nombres de las columnas
            DefaultTableModel modeloTabla = new DefaultTableModel(datos, nombresColumnas);

            // Crear una nueva tabla con el modelo de tabla
            JTable tabla = new JTable(modeloTabla);
            JScrollPane scrollPane = new JScrollPane(tabla);
            scrollPane.setBounds(50, 100, 400, 100);
            add(scrollPane);

        } catch (Exception e) {
            System.out.println(e);
        }

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
        buttonsPanel.add(btnBack);
        buttonsPanel.setBounds(150, 250, 200, 50);
        add(buttonsPanel);

        JPanel PlayPanel = new JPanel();
        PlayPanel.setLayout(new BorderLayout());
        PlayPanel.setBounds(300, 10, 400, 400);
        PlayPanel.setBackground(new Color(125, 125, 125));
        // mainPanel.add(buttonsPanel, BorderLayout.SOUTH);
        add(PlayPanel);

        setTitle("Ranking");
        setIconImage(new ImageIcon("Ahorcado/src/img/1x/jugando-videojuegos.png").getImage());
        setBounds(500, 80, 500, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
