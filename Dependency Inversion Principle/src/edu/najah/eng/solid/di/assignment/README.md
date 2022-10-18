# Dependency Inversion Principle
### How it's violating the Dependency Inversion Principle ?
The high-level module (WindowsMachine) methods depends on low-level modules (Keyboard, monitor), so whenever we need to add a new device we have to implement for it
a new change_DeviceName_Status method.



### How to resolve this violation?
To create new interface (Switchable), where the all switchable devices will implement this interface (Such as keyboard and monitor), and create a new method called
changeStatus that accept any switchable device and change it's status.

![Dependency Inversion Principle drawio](https://user-images.githubusercontent.com/58006991/196540731-0f4b8b2b-a39f-4036-8b57-85d0287078e8.png)
