package solid.ocp.assignment;

import java.util.ArrayList;

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

    public int getOperationResult(Operation operation){
        return -1;
    }
}
////// this one should be NULL then if != NULL we wil go to switch, other wise return invalid -- >IOP addition = new Add();
///// addition.execute(List<Integer> numbers);