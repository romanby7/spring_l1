package ru.sunny.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.sunny.appconfig.ApplicationConfigQualifier;
import ru.sunny.service.AlphaService;

public class AppQualifier{

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfigQualifier.class);
        final AlphaService alphaService = context.getBean(AlphaService.class);

        System.out.println(alphaService.getAlphaBean().getClass().getSimpleName());
        System.out.println(alphaService.getAlphaImpl().getClass().getSimpleName());
    }
}
