package edu.najah.eng.solid.ocp.assignment.impl;
import java.util.List;

import edu.najah.eng.solid.ocp.assignment.intrf.IOperation;

public class Count implements IOperation {

    @Override
    public int Execute(List<Integer> numbers) {
        return numbers.size();
    }
    
}
