package ru.sunny.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.sunny.appconfig.ApplicationConfig;
import ru.sunny.beans.SomeClass2;

public class SpringTestAppConfig {

    public static void main(String[] args) {
        final ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        SomeClass2 someClass2 = context.getBean("someClass2", SomeClass2.class);
        SomeClass2 someClass21 = context.getBean("someClass2", SomeClass2.class);

        System.out.println(someClass2.toString());
        System.out.println(someClass21.equals(someClass2));

    }
}
