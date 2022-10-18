### How it's violating the Signel Responsibility Principle?
The Invoice class have methods that is not related to each other, and not related to the class itselt, for example sendEmail method.


### How to resolve this violation?
1- The class (Invoice) is supposed to be only for creating Invoice tickets.


3- we should have class for actions on invoices (InvoiceHelper).


2- we should have an interface (to accept any type of databases) for Databases, for making connection, add and delete records (IDatabase).


4- we should have a class for sending emails (IMailSender.java)

5- we should have a class for creating the new Email and to check if it's validate.

![Single Responsibility Principle drawio (1)](https://user-images.githubusercontent.com/58006991/196507779-1f45f313-8bf9-49d4-83f6-d8f96cb0bc3d.png)
