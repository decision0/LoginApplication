/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginapplication;
import java.sql.*;

/**
 *
 * @author Asyraf Arshad
 */
public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ladb","root","Root123!");
            s = c.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
