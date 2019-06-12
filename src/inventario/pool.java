/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;

/**
 *
 * @author INVESTIGACION
 */
public class pool {
    
    public DataSource dataSource;
    public String db="inventario";  
    public String url="jdbc:mysql://localhost/"+db; 
    public String user="root";
    public String pass="";
    
    
    public pool(){
        
        inicializaDataSource();     
    }
    
    private void inicializaDataSource(){
        
        BasicDataSource basicDataSource=new BasicDataSource();
        
        basicDataSource.setDriverClassName("org.gjt.mm.mysql");
        basicDataSource.setUsername(user);
        basicDataSource.setPassword(pass);
        basicDataSource.setUrl(url);
        basicDataSource.setMaxActive(50);
        
        dataSource=basicDataSource;
        
    
            }
}
