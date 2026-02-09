package maffile.tikuserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TikUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TikUserServiceApplication.class, args);
    }

}
