package mkaganm.springboottrial.bean.config;

import mkaganm.springboottrial.bean.dto.BeanDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {

    @Bean
    @Scope("singleton") // aplication ile başlar ve application ile biter
//    @Scope("request") // bir istek boyunca çalışır
//    @Scope("session") / bir session boyunca çalışır

    public BeanDto beanDto(){
        return BeanDto.builder()
                .id(0L)
                .beanName("bean name")
                .beanData("bean data")
                .build();
    }
}
