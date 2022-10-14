package edu.najah.eng.solid.ocp.assignment.edu.najah.eng.impl;
import edu.najah.eng.solid.ocp.assignment.edu.najah.eng.intrf.IOperation;

import java.util.List;

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
