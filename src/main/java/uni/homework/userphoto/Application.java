package uni.homework.userphoto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import uni.homework.userphoto.conf.SpringConfig;

/**
 * Created by khajvah on 12/10/17.
 *
 */

@Configuration
@ComponentScan()
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("Started...");
    }
}
