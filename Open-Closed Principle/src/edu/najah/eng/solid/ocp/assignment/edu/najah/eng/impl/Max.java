package edu.najah.eng.solid.ocp.assignment.edu.najah.eng.impl;
import edu.najah.eng.solid.ocp.assignment.edu.najah.eng.intrf.IOperation;
import java.util.List;


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
