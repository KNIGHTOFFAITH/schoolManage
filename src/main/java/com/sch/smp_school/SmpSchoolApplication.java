package com.sch.smp_school;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sch.smp_school.mapper")
public class SmpSchoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmpSchoolApplication.class, args);
    }

}
