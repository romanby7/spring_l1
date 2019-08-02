package ru.sunny.springtest;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.sunny.beans.*;


public class SpringTestClassPath {

    public static void main(String[] args) {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        SomeClass1 someClass1 = context.getBean("someClass1", SomeClass1.class);
        SomeClass1 someClass12 = context.getBean("someClass1", SomeClass1.class);
        SomeClass2 someClass2 = context.getBean("someClass2", SomeClass2.class);
        SomeClass3 someClass3 = context.getBean("someClass3", SomeClass3.class);
        SomeClass3 someClass31 = context.getBean("someClass3", SomeClass3.class);
        SomeClassRef someClassRef = context.getBean("someClassRef", SomeClassRef.class);


        System.out.println(someClass1);
        System.out.println(someClass2);

        System.out.println(someClass1.equals(someClass12));
        System.out.println(someClass3.equals(someClass31));

        someClassRef.print();
    }
}
