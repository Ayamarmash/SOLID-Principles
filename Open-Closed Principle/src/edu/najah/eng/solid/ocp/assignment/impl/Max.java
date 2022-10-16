package edu.najah.eng.solid.ocp.assignment.impl;
import java.util.List;

import edu.najah.eng.solid.ocp.assignment.intrf.IOperation;

public class Max implements IOperation {

    @Override
    public int Execute(List<Integer> numbers) {
        int max = Integer.MIN_VALUE;
        for (Integer number : numbers) {
            if (max < number){
                max = number;
            }
        }
        return max;
    }
    
}
