package ru.sunny.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.sunny.api.AlphabetInterface;
import ru.sunny.appconfig.ApplicationConfigAlphabet;

public class AppPrimary {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfigAlphabet.class);
        System.out.println(context.getBean(AlphabetInterface.class).getClass().getSimpleName());
    }
}
