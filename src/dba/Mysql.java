/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dba;

/**
 *
 * @author yazmin
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mysql 
{
    public static Connection getConnection()
    {
        Connection cn = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/taller", "root", "root");
        } 
        catch (SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
        catch(Exception e1)
        {
            System.out.println("Error: " + e1.getMessage());
        }
            return cn;
    }
    public static void main(String[] args) {
        getConnection();
    }
}