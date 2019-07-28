package ru.sunny.appconfig;


import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import ru.sunny.beans.SomeClass2;

public class ApplicationConfig {

    @Bean(name = "someClass2")
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public SomeClass2 someClass2() {
        SomeClass2 someClass2 = new SomeClass2();
        someClass2.setName("Class ini SomeClass2 name");
        someClass2.setDescription("Class ini SomeClass2 desc");

        return someClass2;
    }
}
