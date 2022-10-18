# Open-Closed Principle
### How it's violating the Open Closed Principle?
The Calculator class there is violation of the Open closed principle, it's not closed for modification as we need to change it in order to extend it and add new operations.



### How to resolve this violation?
1- in the calculator class there will be a method that will take the operation type as a parameter, inside this method a new instance of the method will be created (if the method is valid, otherwise it will throw exception) using the getInstance method in OperationGenerator class (this method is static so we could call it without instantiation).


 2- OperationGenerator.getInstance will check the operation type and return an instance of it, otherwise null.
 
 
 3- IOperation interface will be added so we can implement all operation from it, with Execute method.
 
 
 4- each operation will have it's own class with it's own implementation for Execute method.

![Open Close Principle drawio](https://user-images.githubusercontent.com/58006991/196531138-5c58bd19-e480-40f3-a277-b4d8d09eadc8.png)
