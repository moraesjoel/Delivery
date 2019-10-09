package com.conexao.pacsedex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class PacsedexApplication {

    public static void main(String[] args) throws SQLException {
        try {
            Connection conexao = DriverManager.getConnection(
                    "jdbc:postgresql://localhost/postgres",
                    "postgres", "senha");
            System.out.println("Conectado!");
            conexao.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
