package br.edu.iftm.tspi.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    private static final String URL = "jdbc:mysql://localhost:3306/dbImportacao";

    private static final String USER = "root";

    private static final String PASSWORD = "root";

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}
