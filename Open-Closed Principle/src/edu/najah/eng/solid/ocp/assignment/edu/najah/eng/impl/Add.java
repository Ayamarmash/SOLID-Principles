package edu.najah.eng.solid.ocp.assignment.edu.najah.eng.impl;

import java.util.List;

import edu.najah.eng.solid.ocp.assignment.edu.najah.eng.intrf.IOperation;

public class Add implements IOperation{

    @Override
    public int Execute(List<Integer> numbers) {
        int result = 0;
        for (Integer number : numbers) {
            result += number;
        }
        return result;
    }
    
}
