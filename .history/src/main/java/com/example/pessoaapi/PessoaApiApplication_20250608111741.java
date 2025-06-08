package com.example.pessoaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PessoaApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(PessoaApiApplication.class, args);
    }
}

//siga as instruções abaixo para executar a aplicação:

//1- PASTA PRINCIPAL/CMD/EXECUTE: docker build -t pessoa-api .

//2- EXECUTE: docker run -p 8080:8080 pessoa-api

//3- ABRA NO SEU NAVEGADOR: http://localhost:8080/swagger-ui/index.html


