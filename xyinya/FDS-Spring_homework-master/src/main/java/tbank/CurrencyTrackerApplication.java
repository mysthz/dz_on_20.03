package tbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableScheduling

public class CurrencyTrackerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CurrencyTrackerApplication.class, args);
    }
}

