package edu.najah.eng.solid.ocp.assignment.impl;
import java.util.List;

import edu.najah.eng.solid.ocp.assignment.intrf.IOperation;


public class Min implements IOperation{

    @Override
    public int Execute(List<Integer> numbers) {
        int min = Integer.MAX_VALUE;
        for (Integer number : numbers) {
            if (min > number){
                min = number;
            }
        }
        return min;
    }
    
}
