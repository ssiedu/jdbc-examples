package jdbcexamples;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class RemoveData {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter Roll No : ");
        int r=sc.nextInt();
        String qr="delete from stud where rno=?";
        Connection con=DataUtil.connect();
        PreparedStatement ps=con.prepareStatement(qr);
        ps.setInt(1, r);
        int n=ps.executeUpdate();
        System.err.println(n+" Row Removed");
        con.close();
    }
    
}
