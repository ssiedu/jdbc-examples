package jdbcexamples;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataUtil {

public static Connection connect(){
    Connection con=null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/data11","root","root");
    }catch(Exception e){
        e.printStackTrace();
    }
    return con;
}

    
}
