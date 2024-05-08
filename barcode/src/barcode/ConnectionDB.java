/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barcode;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author VAISAL
 */
public class ConnectionDB {
 Connection koneksi=null;
public static Connection koneksiDb(){
    try
    {
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        //Connection filekoneksi = DriverManager.getConnection("jdbc:derby://localhost/sale","root","123");
        Connection filekoneksi = DriverManager.getConnection("jdbc:derby://localhost/sale","root","123");
        System.out.println("Connection Success");
        return filekoneksi;
    }
    catch (Exception e){
        System.out.println("Connection error");
        return null;
    }
}   
}
