package co.uk.queue.group.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("co.uk.queue.group.*")
public class QueueServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(QueueServiceApplication.class, args);
    }
}
