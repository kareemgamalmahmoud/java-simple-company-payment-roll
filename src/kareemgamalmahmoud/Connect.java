/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kareemgamalmahmoud;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author kareem
 */
public class Connect {
    
    public static Connection connect(){
        
        try
        {
            //class.forName("com.mysql.jdbc.Driver");
            
            //get connection to database
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/prj1?useUnicode=true&characterEncoding=UTF-8","root","");
            JOptionPane.showMessageDialog(null,"connect");
            return con;
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
            return null;
        }
              
             
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Connect.connect();
    }
    
}
