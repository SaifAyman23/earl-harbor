/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package connectionn;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Fakhr Basha
 */
public class Connectionn {

    /**
     * @param args the command line arguments
     */
    private static Connection con = null;
    public static void main(String[] args) {
        // TODO code application logic here
        Connection c;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/earl_harbor", "root", "12345");
//            System.out.print(c);
            System.out.print("succe");
     

        }catch (Exception ex) {
            System.out.println("Error");
        } 
    }
    
}
