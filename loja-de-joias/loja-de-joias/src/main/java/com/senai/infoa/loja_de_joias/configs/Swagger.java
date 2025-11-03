package com.senai.infoa.loja_de_joias.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Aurea",
        version = "1.0",
        description = "Aurea@gmail.com"
    )
)
public class Swagger{

}