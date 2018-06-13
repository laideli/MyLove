package com.wangfang.springcloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    @Bean
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }

}

/*
  @Bean
    public UserService getUserService(){
        return new UserServiceImpl();
    }
*/