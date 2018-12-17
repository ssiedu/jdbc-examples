package jdbcexamples;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DispData {
    public static void main(String[] args) throws Exception {
        String qr="select * from stud where marks>=60";
        Connection con=DataUtil.connect();
        PreparedStatement ps=con.prepareStatement(qr);
        ResultSet rs=ps.executeQuery();
        /*
        while(rs.next()){
            System.out.println(rs.getString(1));
        }
        rs.beforeFirst();
        while(rs.next()){
            System.out.println(rs.getString(2));
        }
        */
        
        while(true){
        boolean b=rs.next();
        if(b==false)break;
        System.out.println(rs.getString("rno"));
        System.out.println(rs.getString("sname"));
        System.out.println(rs.getString("marks"));
        System.out.println("________________________");
        }
        //afterLast->fisrt
        //rs.first();
        //rs.last();
        rs.absolute(2);
        System.out.println(rs.getString("rno"));
        System.out.println(rs.getString("sname"));
        System.out.println(rs.getString("marks"));
        System.out.println("________________________");
        
        
        
        
//        while(true){
//        boolean b=rs.previous();
//        if(b==false)break;
//        System.out.println(rs.getString("rno"));
//        System.out.println(rs.getString("sname"));
//        System.out.println(rs.getString("marks"));
//        System.out.println("________________________");
//        }
        
        
        
        
        con.close();
    }
}
