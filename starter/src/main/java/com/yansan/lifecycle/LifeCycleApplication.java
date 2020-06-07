package com.yansan.lifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类   @SpringBootApplication(scanBasePackages = {"com.yangsan.lifecycle"})   必须配置 scanBasePackages = {"com.yangsan.lifecycle"}
 *         否则可能会扫描不到类
 */
@SpringBootApplication(scanBasePackages = {"com.yangsan.lifecycle"})
public class LifeCycleApplication {

    public static void main(String[] args) {
        SpringApplication.run(LifeCycleApplication.class, args);
    }
}
