package uni.homework.userphoto.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import uni.homework.userphoto.repositories.MongoConf;

@Configuration
@Import(MongoConf.class)
public class SpringConfig {

}
