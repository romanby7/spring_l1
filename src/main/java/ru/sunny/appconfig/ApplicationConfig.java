package ru.sunny.appconfig;


import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import ru.sunny.beans.SomeClass1;
import ru.sunny.beans.SomeClass2;
import ru.sunny.beans.SomeClass3;

@Configuration
public class ApplicationConfig {

    @Bean(name = "someClass2")
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public SomeClass2 someClass2() {
        SomeClass2 someClass2 = new SomeClass2();
        someClass2.setName("Class ini SomeClass2 name");
        someClass2.setDescription("Class ini SomeClass2 desc");

        return someClass2;
    }

    @Bean
    public SomeClass3 someClass3() {
        return new SomeClass3();
    }

    @Bean("someClass1Java")
    public SomeClass1 someClass1() {
        SomeClass1 someClass1 = new SomeClass1();
        someClass1.setName("somClass1Name");
        someClass1.setDescription("somClass1Descr");

        return  someClass1;
    }
}
