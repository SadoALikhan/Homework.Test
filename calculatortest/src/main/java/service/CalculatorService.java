package service;

import org.springframework.stereotype.Service;

@Service
public interface CalculatorService {


    Integer plus(Integer num1, Integer num2);

    Integer minus(Integer num1, Integer num2);

    Integer multiply(Integer num1, Integer num2);

    Integer divide(Integer num1, Integer num2);
}