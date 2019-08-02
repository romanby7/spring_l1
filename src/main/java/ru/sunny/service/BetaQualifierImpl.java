package ru.sunny.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.sunny.api.AlphabetInterface;

@Component
@Qualifier("impl")
public class BetaQualifierImpl implements AlphabetInterface {

}
