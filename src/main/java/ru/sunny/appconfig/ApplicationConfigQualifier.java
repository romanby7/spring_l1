package ru.sunny.appconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.sunny.service.AlphaQualifierBean;
import ru.sunny.service.AlphaService;
import ru.sunny.service.BetaQualifierImpl;

@Configuration
public class ApplicationConfigQualifier {

    @Bean
    AlphaQualifierBean getAlphaQualifierBean() {
        return new AlphaQualifierBean();
    }

   @Bean
    BetaQualifierImpl getBetaQualifierImpl() {
        return new BetaQualifierImpl();
   }


   @Bean
    AlphaService getAlphaService() {
        return new AlphaService();
   }


}
