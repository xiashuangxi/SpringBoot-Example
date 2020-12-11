package com.sbe.tdd.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
@MapperScan("com.sbe.tdd.mapper")
public class MySqlConfig {
}
