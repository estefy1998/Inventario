
package inventario;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {
     private Connection conectar = null;
    
    
    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bodega", "root", "");
            //JOptionPane.showMessageDialog(null, "Conexion Establecida","Mensaje",JOptionPane.INFORMATION_MESSAGE);
        } catch (ClassNotFoundException | SQLException error) {
            JOptionPane.showMessageDialog(null, "Error al Conectarse"+"\n"+error,"Mensaje Error",JOptionPane.ERROR_MESSAGE);
        }
        return conectar;
    
}
}
