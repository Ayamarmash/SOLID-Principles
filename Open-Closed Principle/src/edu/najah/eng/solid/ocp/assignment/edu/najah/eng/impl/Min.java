package edu.najah.eng.solid.ocp.assignment.edu.najah.eng.impl;
import edu.najah.eng.solid.ocp.assignment.edu.najah.eng.intrf.IOperation;
import java.util.List;


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
