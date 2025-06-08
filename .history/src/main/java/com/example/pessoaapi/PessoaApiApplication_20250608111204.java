package com.example.pessoaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PessoaApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(PessoaApiApplication.class, args);
    }
}

//

//docker build -t pessoa-api .

//docker run -p 8080:8080 pessoa-api

//http://localhost:8080/swagger-ui/index.html


