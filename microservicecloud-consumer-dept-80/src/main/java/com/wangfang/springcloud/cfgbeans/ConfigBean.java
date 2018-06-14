package com.wangfang.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced  /*负载均衡 默认轮询算法*/
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }

   /* @Bean
    public IRule myRule(){

        //return new RoundRobinRule();
        *//*使用随机算法替代默认轮询*//*
        return new RandomRule();
    }*/

}

/*
  @Bean
    public UserService getUserService(){
        return new UserServiceImpl();
    }
*/