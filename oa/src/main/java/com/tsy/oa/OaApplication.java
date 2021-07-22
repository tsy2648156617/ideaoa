package com.tsy.oa;

import com.tsy.oa.utils.IdWorker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.env.Environment;


/**
 * @author 小唐子
 */
@Slf4j
@SpringBootApplication(scanBasePackages = "com.tsy.oa")
@EnableAspectJAutoProxy(exposeProxy = true)
public class OaApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(OaApplication.class);
        Environment env = app.run(args).getEnvironment();
        log.info("启动成功！！");
        log.info("oa系统后端地址: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
    }
    @Bean
    public IdWorker idWorker(){
        return new IdWorker();
    }
}
