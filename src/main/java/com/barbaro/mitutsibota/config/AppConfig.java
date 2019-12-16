package com.barbaro.mitutsibota.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories("com.barbaro.mitutsibota.dao")	
public class AppConfig {

}
