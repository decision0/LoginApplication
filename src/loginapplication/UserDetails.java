/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginapplication;

/**
 *
 * @author Asyraf Arshad aka Decision0
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class UserDetails extends JFrame implements ActionListener {
    JTable t1;
    JButton b1;
    String x[] = {"username","name","role"};
    String y[][] = new String[40][40];
    int i=0, j=0;
    UserDetails(){
        super("<RESTRICTED> User Details");
        setSize(1200,650);
        setLocation(400,150);
        
        try{
            Conn c1  = new Conn();
            String q1 = "select * from login;";
            ResultSet rs  = c1.s.executeQuery(q1);
            while(rs.next()){
                y[i][j++]=rs.getString("username");
                y[i][j++]=rs.getString("name");
                y[i][j++]=rs.getString("role");
                i++;
                j=0;
            }
            t1 = new JTable(y,x);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        b1 = new JButton("Print");
        add(b1,"South");
        JScrollPane sp = new JScrollPane(t1);
        add(sp);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        try{
            t1.print();
        }catch(Exception e){}
    }
    
    public static void main(String[] args){
        new UserDetails().setVisible(true);
    }
}
