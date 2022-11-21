package com.example.payment.mapping;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("AgroassistMappingConfiguration")
public class MappingConfiguration {
    @Bean
    public UsersMapper farmerMapper(){
        return new UsersMapper();
    }

}