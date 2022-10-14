package edu.najah.eng.solid.ocp.assignment;

import java.util.ArrayList;

import edu.najah.eng.solid.ocp.assignment.intrf.IOperation;

public class Calculator {

    private ArrayList<Integer> numbers = null;


    public Calculator(){
        numbers = new ArrayList<>();
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void addNumber(int number){
        numbers.add(number);
    }
    public void removeNumberAtIndex(int index){
        if (index < 0 || index >= numbers.size()){
            System.out.println("Invalid number: " + index);
            return;
        }
        numbers.remove(index);
    }

    public int getOperationResult(Operation operation) throws Exception{
        IOperation op = OperationGenerator.getInstance(operation);
        if(op != null) return op.Execute(numbers);
        throw new Exception("Invalid Operation, try again.");
    }
}