package edu.najah.eng.solid.ocp.assignment.edu.najah.eng.impl;
import edu.najah.eng.solid.ocp.assignment.edu.najah.eng.intrf.IOperation;
import java.util.List;

public class Count implements IOperation {

    @Override
    public int Execute(List<Integer> numbers) {
        return numbers.size();
    }
    
}
