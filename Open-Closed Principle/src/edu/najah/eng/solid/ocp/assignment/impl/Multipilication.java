package edu.najah.eng.solid.ocp.assignment.impl;
import java.util.List;

import edu.najah.eng.solid.ocp.assignment.intrf.IOperation;

public class Multipilication implements IOperation{

    @Override
    public int Execute(List<Integer> numbers) {
        int result = 1;
        for (Integer number : numbers) {
            result *= number;
        }
        return result;
    }
    
}
