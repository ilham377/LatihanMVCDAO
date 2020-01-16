/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.milhama.latihanmvcjdbc.database;


import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import edu.milhama.latihanmvcjdbc.entity.Pelanggan;
import edu.milhama.latihanmvcjdbc.impl.PelangganDaoImpl;
import edu.milhama.latihanmvcjdbc.service.PelangganDao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * Nama : Muhammad Ilham Apriyadi
 * Kelas : IF2
 * NIM : 10118045
 */
public class BarbershopDatabase {

    private static Connection connection;
    private static PelangganDao pelangganDao;

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setUrl("jdbc:mysql://localhost:3306/kingsbarbershop");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = dataSource.getConnection();
        }
        return connection;
    }
    
    public static PelangganDao getPelangganDao()throws SQLException{
       if(pelangganDao==null){
         pelangganDao = new PelangganDaoImpl((com.mysql.jdbc.Connection) getConnection()) {};
       } 
       return pelangganDao;
    }
    
    
}
