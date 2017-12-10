package uni.homework.userphoto.repositories;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import uni.homework.userphoto.repositories.impl.PhotoRepositoryImpl;
import uni.homework.userphoto.repositories.impl.UserRepositoryImpl;

/**
 * Created by khajvah on 12/10/17.
 */
@Configuration
@EnableMongoRepositories
public class MongoConf {
    @Value("${mongo.uri}")
    private String mongoUri;

    @Bean
    MongoTemplate template() {
        System.out.println("Connecting to mongo...");
        MongoClient mongoClient = new MongoClient(new MongoClientURI(mongoUri));

        return new MongoTemplate(mongoClient, "DB");
    }

    @Bean
    UserRepository userRepository() {
        return new UserRepositoryImpl();
    }

    @Bean
    PhotoRepository photoRepository() {
        return new PhotoRepositoryImpl();
    }
}
