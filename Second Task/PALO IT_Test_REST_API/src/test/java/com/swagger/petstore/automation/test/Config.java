package com.swagger.petstore.automation.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.swagger.petstore.automation.test")
@Import(
        {
                com.swagger.petstore.automation.Config.class
        }
)
public class Config {
}
