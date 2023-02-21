package org.example.classes;

import org.example.interfaces.Grade;
import org.springframework.stereotype.Component;

/**
 * @author Bahadir Tasli
 * @Date 2/21/2023
 */
@Component(value = "Class2-results")
public class Class2 implements Grade {
    private int results;

    public Class2() {
        this.results = Integer.parseInt("99");
    }

    @Override
    public int getExamResult() {
        return this.results;
    }
}
