/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bnsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author fauziahrizky22
 */
public class Konfig {
    private Connection mysqlconfig;
    public Connection configDB()throws SQLException{
        try {
            String url="jdbc:mysql://localhost:3306/bnsp"; //url database
            String user="root"; //user database
            String pass=""; //password database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);            
            } catch (Exception e) {
                System.err.println("koneksi gagal "+e.getMessage()); //perintah menampilkan error pada koneksi
                }
            return mysqlconfig;
        }      
}
