package com.wangfang.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        /*
        * 自定义负载均衡规则
        * 每个微服务调用五次
        * 切换到下一个服务
        * */
        return new RandomRule_WF();
    }

}
