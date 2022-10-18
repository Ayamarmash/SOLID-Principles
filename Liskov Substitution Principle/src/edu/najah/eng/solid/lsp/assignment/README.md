# Liskov Substitution Principle
### How it's violating the Open Closed Principle?
The AddOffer method in the LimitedCustomer returns error message whenever we try to add new offer over the limit.


### How to resolve this violation?
Change the return value of AddOffer method to Boolean, so it return True if the offer was added, other wise it just returns false

![Liskov Substitution Principle drawio](https://user-images.githubusercontent.com/58006991/196551980-6379145d-ddc1-4ee2-9df8-31da28a4144d.png)
