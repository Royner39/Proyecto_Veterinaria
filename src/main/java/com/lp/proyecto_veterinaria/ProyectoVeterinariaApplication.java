package com.lp.proyecto_veterinaria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProyectoVeterinariaApplication {

    public static void main(String[] args) {
        //SpringApplication.run(ProyectoVeterinariaApplication.class, args);

    ApplicationContext applicationContext = SpringApplication.run(ProyectoVeterinariaApplication.class, args);
    SpringBeanLoader.setApplicationContext(applicationContext);
    }
}
