
package schoolmanager.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static String connectionString = "jdbc:postgresql://localhost:5433/SchoolManager";
    private static String user = "postgres";
    private static String password = "dbadmin";
    
    public static Connection conectar()
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(connectionString, user, password);            
        }
        catch(Exception ex)
        {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        }
    }
    
    public static void desconectar(Connection con)
    {
        try
        {            
            con.close();            
        }
        catch(Exception ex)
        {
            System.out.println("Erro ao desconectar: "+ ex.getMessage());
        }
    }
}
