package uni.homework.userphoto.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import uni.homework.userphoto.repositories.MongoConf;

/**
 * Created by khajvah on 12/10/17.
 */
@Configuration
@Import(MongoConf.class)
public class SpringConfig {

}
