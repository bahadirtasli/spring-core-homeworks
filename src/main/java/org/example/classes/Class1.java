package org.example.classes;

import org.example.interfaces.Grade;
import org.springframework.stereotype.Component;

/**
 * @author Bahadir Tasli
 * @Date 2/21/2023
 */

@Component(value = "Class1-results")
public class Class1 implements Grade {

    private int results;

    public Class1() {
        this.results = Integer.parseInt("100");
    }

    @Override
    public int getExamResult() {
        return this.results;
    }
}
