package com.sbe.ms.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
@MapperScan("com.sbe.ms.mapper")
public class MyBatisConfig {
}
