package org.example.classes;

import lombok.Setter;
import org.example.interfaces.Grade;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Bahadir Tasli
 * @Date 2/21/2023
 */

@Setter
@Component
public class Calculator {

    private Grade results;

    public Calculator(@Qualifier("Class1-results") Grade results){
        this.results = results;
    }

    public String getResults() {
        return "Results :" + results.getExamResult();
    }


}
