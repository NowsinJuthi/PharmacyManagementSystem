/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacy.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Nowsin
 */
    
public class database {

    
    
  public static Connection connectDb(){
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect =  DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy", "root","root");
              
            return connect;
        }catch(Exception e){e.printStackTrace();}
        return null;
    }
    
}
