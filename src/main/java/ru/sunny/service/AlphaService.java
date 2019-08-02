package ru.sunny.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.sunny.api.AlphabetInterface;

@Component
public class AlphaService {

    @Autowired
    @Qualifier("bean")
    private AlphabetInterface alphaBean;

    @Autowired
    @Qualifier("impl")
    private  AlphabetInterface alphaImpl;

    public AlphabetInterface getAlphaBean() {
        return alphaBean;
    }

    public AlphabetInterface getAlphaImpl() {
        return alphaImpl;
    }
}
