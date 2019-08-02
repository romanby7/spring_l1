package ru.sunny.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.sunny.beans.*;

public class AppScan {

    public static void main(String[] args) {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.sunny.beans");
        context.refresh();

        final SomeClass1 someClass1 = context.getBean(SomeClass1.class);
        someClass1.setName("someClass1");
        final SomeClass2 someClass2 = context.getBean(SomeClass2.class);
        someClass2.setName("someClass2");

        final SomeClass3 someClass3 = context.getBean(SomeClass3.class);

        System.out.println(someClass1);
        System.out.println(someClass2);
        System.out.println(someClass3);



    }
}
