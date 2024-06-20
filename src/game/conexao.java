
package game;

import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.SQLException; 

public class conexao {
    private static final String url = "jdbc:mysql://localhost:3306/bdteste";
    private static final String user = "root";
    private static final String password = "";
    
    private static Connection conn;
    
    public static Connection getConexao() throws SQLException{
        try {
            if(conn == null){
                conn = DriverManager.getConnection(url, user, password);
                return conn;
            }else{
                return conn;
            }
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
} 

