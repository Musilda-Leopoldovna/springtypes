package koschei.config;

import koschei.models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public Island2 getIsland() {
        return new Island2();
    }

    @Bean
    public Rabbit4 getRabbit(Duck5 duck5) {
        return new Rabbit4(duck5);
    }

    @Bean
    public Needle7 getNeedle() {
        return new Needle7();
    }
}
