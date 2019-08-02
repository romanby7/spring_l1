package ru.sunny.appconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import ru.sunny.service.AlphaClass;
import ru.sunny.service.BetaClass;

@Configuration
public class ApplicationConfigAlphabet {

    @Bean
    public AlphaClass getAlphaClass() {
        return new AlphaClass();
    }

    @Bean
    @Primary
    public BetaClass getBetaClass() {
        return new BetaClass();
    }

}
