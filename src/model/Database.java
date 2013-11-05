/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Joseph
 */
public class Database {
    private Statement stmt;
    
    public Database(String database) {
        try {
            // TOD try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn;
                String db = "mycontacts";
                String url = "jdbc:mysql://localhost:3306/" + database;
                conn = DriverManager.getConnection(url, "root", "yhdxyady");
                stmt = conn.createStatement();
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver");
        } catch (SQLException ex) {
            System.out.println("Forbindelse");
        }
    }    

    public ResultSet selectQuery(String query) {
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(query);
            
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
}
