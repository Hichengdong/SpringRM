package cqut.yook.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("cqut.yook.dao")
public class MyConfig {

}
