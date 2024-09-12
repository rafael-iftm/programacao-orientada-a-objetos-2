package br.edu.iftm.tspi.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    private static final String URL = System.getenv("DB_URL");
    private static final String USER = System.getenv("DB_USER");
    private static final String PASSWORD = System.getenv("DB_PASSWORD");

    // Construtor privado para evitar instanciação
    private Conexao() {
        throw new UnsupportedOperationException("Esta classe não pode ser instanciada");
    }

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
