package Controller;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author Jordy
 */
public class ConnectionDB {
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String user_pass = "";
    private static final String url = "jdbc:mysql://localhost:3306/extras_db";

    Connection connect = null;

    public Connection Conectar() {
        try {
            Class.forName(driver);
            connect = (Connection) DriverManager.getConnection(url, user, user_pass);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion " + e);
        }
        return connect;
    }
}
