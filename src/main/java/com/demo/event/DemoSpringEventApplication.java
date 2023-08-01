package com.demo.event;

import com.demo.event.ok.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoSpringEventApplication {
    @Autowired
    Publisher publisher;
    public static void main(String[] args) {
        SpringApplication.run(DemoSpringEventApplication.class, args);
    }
    @Bean
    CommandLineRunner run() {
        return args -> {
            System.out.println(Thread.currentThread().getName() + ": Chuẩn bị tạo event");
            System.out.println(Thread.currentThread().getName() + ": Tác động tạo event");
            // gõ cửa
            publisher.happenedEvent();
            System.out.println(Thread.currentThread().getName() +": Tiếp tục thực hiện sau khi Listener thực hiện");
        };
    }
}
