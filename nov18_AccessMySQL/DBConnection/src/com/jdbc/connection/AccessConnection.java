package com.jdbc.connection;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author Rajail Islam
 */
public class AccessConnection {

    public static void main(String[] args) {
        getAccessConnection();
    }

    public static Connection getAccessConnection() {
        String user = "";
        String pass = "";
        Connection con = null;
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://D:\\Users\\J2EE-33\\Desktop\\JAVA\\DBConnection\\accessConn.accdb", user, pass);
            System.out.println(":::Connected:::");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}
