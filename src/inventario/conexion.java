
package inventario;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;

public class conexion {
    static Connection conectar=null;
    static Connection conexion=null;
    static Statement sentencia;
    static ResultSet resultado;

    static ArrayList<String> llenar_combo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

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
    /*public static ArrayList<String> llenar_combo(){
    ArrayList<String> lista = new ArrayList<String>();
    String q = "SELECT * FROM categoria";
    try {
    resultado = sentencia.executeQuery(q);
    System.out.println("Correcto");
    } catch (Exception e) {
    System.out.println("No Correcto");
    }
    try {
    while(resultado.next()){
    lista.add(resultado.getString("nombre"));
    }
    } catch (SQLException e) {
    }
    return lista;
    
}*/

public ResultSet consulta(String sql){
 ResultSet resultado=null;
 try{
     PreparedStatement pstm=conectar.prepareStatement(sql);
     resultado=pstm.executeQuery();
 }catch (SQLException e){
 System.err.println("error de consulta: "+ e.getMessage());
 
 }
 return resultado;
}

/*public conexion categoria(){
conexion listamodelo=new conexion();
listamodelo.addElement("seleciones una clave");
ResultSet resultado=this.consulta("select id_categoria from producto");
try{
while(resultado.next()){
listamodelo.addElement(resultado.getString(id_categoria));
}
}catch (SQLException ex){
System.err.println(ex.getMessage());
}
return listamodelo;
}*/


}

