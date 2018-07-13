package com.briup.app02.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//映射接口
@MapperScan("com.briup.app02.dao")
public class MybatisConfig {

}
