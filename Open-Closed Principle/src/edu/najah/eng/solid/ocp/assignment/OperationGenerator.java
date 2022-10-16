package edu.najah.eng.solid.ocp.assignment;

import edu.najah.eng.solid.ocp.assignment.intrf.IOperation;
import edu.najah.eng.solid.ocp.assignment.impl.*;

public class OperationGenerator {
    public static IOperation getInstance(Operation operation){

        if(operation.equals(Operation.Addition)){
            return new Add();
        }
        if(operation.equals(Operation.Count)){
            return new Count();
        }
        if(operation.equals(Operation.Max)){
            return new Max();
        }
        if(operation.equals(Operation.Min)){
            return new Min();
        }
        if(operation.equals(Operation.Multiplication)){
            return new Multipilication();
        }
        return null;
    }
}
