
package Config;
/**
 * koneksi ke database
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class koneksi1 {
    public static Connection KoneksiDB(){
   try {
            String url =  "jdbc:Mysql://sql12.freesqldatabase.com/sql12756315";
            //String url = "jdbc:Mysql://localhost:3306/ dbkedai_kopi";
            String user = "sql12756315";
            String pass = "8N2R8GF2Xk";
          
           /*String url = "jdbc:Mysql://localhost:3306/ dbkedai_kopi";
            String user = "root";
            String pass = "";*/
             DriverManager.registerDriver( new com.mysql.cj.jdbc.Driver());
            Connection conn = DriverManager.getConnection(url, user , pass);
        return conn;
            
        } catch (SQLException e) {  
           JOptionPane.showMessageDialog(null, e);
        }
        return null;
        
   }
}
    

               