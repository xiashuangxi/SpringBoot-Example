package com.sbe.redis.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;

import java.lang.reflect.Method;

@Configurable
@EnableCaching
public class RedisConfig extends CachingConfigurerSupport {

    @Bean
    public KeyGenerator getKeyGenerator(){
        return new KeyGenerator(){
            @Override
            public Object generate(Object target, Method method, Object... params){
                StringBuilder sb = new StringBuilder();
                sb.append(target.getClass().getName());
                sb.append(method.getName());
                for(Object key : params){
                    sb.append(key.toString());
                }
                return sb.toString();

            }
        };
    }
}
