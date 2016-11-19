package app;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by dapeng on 19/11/16.
 */

@Configuration
class Config {

    @Bean
    SomeService someService() {
        return new SomeService();
    }

    @Bean
    ApplicationRunner applicationRunner(SomeService service) {
        return args -> System.out.println("am = " + service);
    }
}