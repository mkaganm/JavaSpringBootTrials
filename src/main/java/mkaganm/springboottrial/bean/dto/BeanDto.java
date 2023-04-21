package mkaganm.springboottrial.bean.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Log4j2
@Builder
public class BeanDto {

    private Long id;
    private String beanName;
    private String beanData;

    // start
    public void initBeanMethod(){
        log.info("Bean init");
        System.out.println("bean init");
    }


    // finish
    public void destroyBeanMethod(){
        log.info("Bean finish");
        System.err.println("bean finish");
    }
}
