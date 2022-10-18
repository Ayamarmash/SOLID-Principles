# Interface Segregation Principle
### How it's violating the Open Closed Principle?
Both Eagle and penguin classes have to implement methods they will never use, Swim in Eagle, and Fly in penguin.



### How to resolve this violation?
1- Create an interface for birds, and put all of the mutual methods/attributes inside this interface so all birds implement it.


2- Create new interfaces that includes the method required for each speciality, for example Swimable so the swimable birds implements this interface in addition of the
previous one.
