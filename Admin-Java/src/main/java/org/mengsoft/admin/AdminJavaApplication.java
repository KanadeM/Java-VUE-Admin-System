package org.mengsoft.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.mengsoft.admin.mapper")
public class AdminJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminJavaApplication.class, args);
    }

}
