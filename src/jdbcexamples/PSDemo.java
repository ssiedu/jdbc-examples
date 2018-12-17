package jdbcexamples;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PSDemo {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Roll No. : ");
        int x=sc.nextInt();
        System.out.println("Enter Name : ");
        String y=sc.next();
        System.out.println("Enter Marks : ");
        int z=sc.nextInt();
        String qr="insert into stud values(?,?,?)";
        Connection con=DataUtil.connect();
        PreparedStatement ps=con.prepareStatement(qr);
        ps.setInt(1, x);
        ps.setString(2, y);
        ps.setInt(3, z);
        int n=ps.executeUpdate();
        con.close();
        System.out.println("RECORD ADDED");
    }
    
}
