package com.conexao.pacsedex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class PacsedexApplication {

    public static void main(String[] args) throws SQLException {
        SpringApplication.run(PacsedexApplication.class, args);
        try {
            Connection conexao = DriverManager.getConnection(
                    "jdbc:postgresql://localhost/postgres",
                    "postgres", "senha");
            System.out.println("Conectado ao data base!");
            conexao.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
@RestController
class GreetingController{
    @RequestMapping(value = "/conexao", method = RequestMethod.GET)
    public String greet(){
        return "{ preco : 20,00}";
    }
}

