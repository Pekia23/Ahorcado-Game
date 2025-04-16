import java.sql.*;
import javax.swing.JOptionPane;

public class Data {

    /* Declaramos 4 variables con el driver, la bbdd, usuario y contraseña */
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String bbdd = "jdbc:mysql://localhost/ahorcado";
    private static final String usuario = "root";
    private static final String clave = "123456";

    /*
     * Creamos el método para conectarnos a la base de datos. Este método
     * devolverá un objeto de tipo Connection.
     */
    public static Connection Conexion() {
        Connection conex = null;
        try {
            Class.forName(driver);
            conex = DriverManager.getConnection(bbdd, usuario, clave);
        } catch (Exception e) {
            System.out.println("Error al conectar con la base de datos.\n" + e.getMessage().toString());
        }
        return conex;
    }

    public static String[] ConsultaPalabra() {
        String palabras[] = new String[259];
        try {
            Connection conex = null;
            conex = Data.Conexion();
            PreparedStatement ps;
            ResultSet res;
            ps = conex.prepareStatement("SELECT palabras.palabra FROM palabras");
            res = ps.executeQuery();
            int i = 0;
            while (res.next()) {
                palabras[i] = res.getString("palabras.palabra");
                i += 1;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return palabras;
    }

    public static boolean ConsultarApodo(String apodo) {
        boolean x = true;
        try {
            Connection conex = null;
            conex = Data.Conexion();
            PreparedStatement ps;
            ResultSet res;
            ps = conex.prepareStatement("SELECT jugador.apodo FROM jugador WHERE jugador.apodo = ? ");
            ps.setString(1, apodo);
            res = ps.executeQuery();
            if (res.next()) {
                x = false;
            } else {
                x = true;
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return x;
    }

    public static void AgregarJugador(String apodo) {
        try {
            Connection conex = null;
            conex = Data.Conexion();
            PreparedStatement ps;
            ps = conex.prepareStatement("INSERT INTO jugador (apodo,puntaje) VALUES(?,?)");
            ps.setString(1, apodo);
            ps.setInt(2, 0);

            int r = ps.executeUpdate();
            if (r > 0) {
                JOptionPane.showMessageDialog(null, apodo + " Se ha guardado con exito", "REGISTRO CON EXITO",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, apodo + " NO Se ha guardado con exito", "ERROR DE REGISTRO",
                        JOptionPane.ERROR_MESSAGE);

            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static int CantidadLetras(String palabra) {
        int numero = 0;
        try {
            Connection conex = null;
            conex = Data.Conexion();
            PreparedStatement ps;
            ResultSet res;
            ps = conex.prepareStatement(
                    "SELECT palabras.cantidadPalabra, palabras.cantidadEspacio FROM palabras WHERE palabras.palabra = ?");
            ps.setString(1, palabra);
            res = ps.executeQuery();
            while (res.next()) {
                numero = res.getInt("palabras.cantidadPalabra") + res.getInt("palabras.cantidadEspacio");

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return numero;
    }

    public static void UpdateJugador(int puntaje, String apodo) {
        try {
            Connection conex = null;
            conex = Data.Conexion();
            PreparedStatement ps;
            ps = conex
                    .prepareStatement("UPDATE jugador SET jugador.puntaje = jugador.puntaje +? WHERE jugador.apodo=?");
            ps.setInt(1, puntaje);
            ps.setString(2, apodo);
            int r = ps.executeUpdate();
            if (r > 0) {
                JOptionPane.showMessageDialog(null, " Se ha actualizado con exito la información de " + apodo,
                        "REGISTRO CON EXITO",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                System.out.println("Error");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void UpdateData(int puntaje, String apodo, String palabra, int x) {
        try {
            Connection conex = null;
            conex = Data.Conexion();
            PreparedStatement pss;
            pss = conex.prepareStatement(
                    "INSERT INTO evento (evento.Jugador,evento.palabraAdivinar,evento.estado, evento.puntuacion) VALUES(?,?,?,?)");
            pss.setString(1, apodo);
            pss.setString(2, palabra);
            if (x == 1) {
                pss.setString(3, "Gano");
            } else
                pss.setString(3, "Perdio");
            pss.setInt(4, puntaje);
            int rs = pss.executeUpdate();
            if (rs > 0) {
                JOptionPane.showMessageDialog(null, " Se acabo el juego ", "REGISTRO CON EXITO",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                System.out.println("Error");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}