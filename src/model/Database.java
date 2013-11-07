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
    private String database;

    public Database(String database) throws ClassNotFoundException, SQLException {
        stmt = null;
        this.database = database;
        createStatement();
    }

    public void createStatement() throws ClassNotFoundException, SQLException {
        if (stmt != null) {
            stmt.close();
        }
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn;
        String db = "mycontacts";
        String url = "jdbc:mysql://localhost:3306/" + database;
        conn = DriverManager.getConnection(url, "root", "yhdxyady");
        stmt = conn.createStatement();

    }

    public ResultSet selectQuery(String query) throws SQLException {
        ResultSet rs = null;
        rs = stmt.executeQuery(query);
        return rs;
    }

    public void query(String query) throws SQLException {
        stmt.execute(query);
    }
}
