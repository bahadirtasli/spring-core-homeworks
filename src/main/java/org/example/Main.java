package org.example;

import org.example.classes.Calculator;
import org.example.classes.Class1;
import org.example.classes.Class2;
import org.example.configuration.ApplicationConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

/**
 * @author Bahadir Tasli
 * @Date $DATE
 */
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(ApplicationConfiguration.class);
        applicationContext.refresh();

        Calculator calculator = applicationContext.getBean(Calculator.class);
        System.out.println("Average exam results of Class1" + calculator.getResults());

        calculator.setResults(new Class2());
        System.out.println("Average exam results of Class2" + calculator.getResults());

    }

}