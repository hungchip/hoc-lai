package com.vuviethung.mysqlconnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class MySQLConnector {
    private Connection connection = null;
    private String url = "jdbc:mysql://localhost:3306/csdlhangkhong";
    private String userName = "root";
    private String password = "1234";

    private Connection connectionMySQL(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url,userName,password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return connection;
    }
    public Connection getConnection(){
        return connectionMySQL();
    }
}
