### How it's violating the Open Closed Principle?
The Calculator class there is violation of the Open closed principle, there will be modifications on the code if we want to add new operations or edit any operation.



### How to resolve this violation?
1- in the calculator class there will be a method that will take the operation type as a parameter, inside this method a new instance of the method will be created 
(if the method is valid, otherwise it will throw exception) using the getInstance method in OperationGenerator class (this method is static so we could call it 
without instantiation).


 2- OperationGenerator.getInstance will check the operation type and return an instance of it, otherwise null.
 
 
 3- IOperation interface will be added so we can implement all operation from it, with Execute method.
 
 
 4- each operation will have it's own class with it's own implementation for Execute method.

