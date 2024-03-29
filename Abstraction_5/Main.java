package Abstraction_5;

/*
Abstractoin : Hiding the internal implementation of the (method, feature) and only showing the functionality to the users.

There are only abstract classes and abstract methods .

We cannot make any thing abstract and static at the same time.
We cannot make any thing private and abstract at the same time.

Types of Abstraction:
                     - Data Abstraction. 
                     - Control Abstraction.

Ways to achive Abstraction :
                            - Abstract Class. (Partial Abstraction  to 0 to 100 % ) 
                            - Interface.      (Fully Abstraction 100 % ) // JDK 1.7             


A concrete class : is a class that has an implementaion for all of its methods.

Rules : 
          - An abstract class must be declared with an abstract keyword.
          - It can have abstract and non-abstract methods.
          - It cannot be instantaited.
          - It can have final methods which will force the subclass not to change the body of the methods. 
          - It can heve constructors and static methods also. 
          
If we want to implement only some of the abstract methods in the subclass we have to make this class abstract 
and write the other methods that have no implementation as it is in the subclass.         

UML class diagram abstract class (the font of class 'name is italic. or btween << >> )          
 */

public class Main {

    /*Instead of making two methods to do the same thing but each of them take an object from a diffirent subclass 
      we cane make a one method that receve an object from the parenrt class.*/   
    static void fun (Care obj){ 
        obj.autopilot();
    }
    public static void main (String [] args){
        SUV suv = new SUV();

        suv.autopilot();

        fun(new SUV()); // we can send any object from the "Care" class or its subclasses.

        /* If we declared an object from the subclass by the super class we can invoke by this object only the methods 
           that are existed in two classes (sub,super) like this.
          */  
          /* 
           Care Care1;
           Care1 = new SUV ();
           Care1.m1; //--->> this step will give an error because this method is existed in only the supclass not in the two classes.
         
          */
    
    }
    
}
