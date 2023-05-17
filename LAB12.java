/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dbprogramming2;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Student
 */
public class LAB12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb2";
        String username = "root";
        String password = "mysql@sit";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            
            String sql = "INSERT INTO student(studentID,firstName,lastName,email,deptID)"
                    + "VALUES(?,?,?,?,?)";
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setString(1, "111111");
            preparedStatement.setString(2, "aaaa");
            preparedStatement.setString(3, "bbbb");
            preparedStatement.setString(4, "aaaa@gmail.com");
            preparedStatement.setString(5, "IT");
            
            preparedStatement.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB8.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB8.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
