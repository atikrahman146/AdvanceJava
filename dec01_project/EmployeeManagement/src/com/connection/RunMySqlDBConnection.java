package com.connection;

import java.sql.Connection;

/**
 *
 * @author Rajail Islam
 */
public class RunMySqlDBConnection {

    public static Connection connMysql = MySqlDbConnection.getConnection("root", "1234");

    public static void main(String[] args) {
        //Connection connTest = MySqlDbConnection.getConnection();
    }

}
