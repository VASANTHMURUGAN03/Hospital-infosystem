
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
/**
 *
 * @author Vasanth
 */
public class connectionprovider {

    /**
     *
     * @return
     */
    public static Connection getCon(){
    
      //Connection connection= null;
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldetails","vasanth","V@s@nth12");
         //Statement statement;
       //  statement=connection.createStatement();
        // ResultSet resultSet;
       /*  resultSet =statement.executeQuery("SELECT * FROM hospitaldetails.`patient details`;");
         //int code;
         //String title;
         while(resultSet.next()){
             System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getInt(3)+" "+resultSet.getString(4));
             }
         resultSet.close();
         statement.close();
         connection.close();*/
       return con;
         
      }
      catch (ClassNotFoundException | SQLException e) {
         return null;
      }
   }
    
}
