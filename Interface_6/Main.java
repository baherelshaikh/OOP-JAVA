package Interface_6;
/*
what is Interface ?!
                     - Not UI/UX
                     - A list of method signatures (abstract methods)
                     - Contract
                     - The is hte only mechanisme that allows achiveing multiple inheritance(frome two diffirent classes) in java.
                     - Class implements 1:M interface. Does not extend.

the diffirance between the abstract class and the interface:                    
                                                            - In the interface if we declared the atrebutes like this "int maxspeed = 120 ;" 
                                                              the cmpiler make this as a "public static final int max speed = 120"
                                                              and if we declared the methods like this "void move(); " the compiler make this as a "public abstract void move(); ".  
                                                            - Interface Does not have constructors.  

Which java types can implement Interface ?!
                                           - Java Class.                 
                                           - Java Abstract Class.                 
                                           - Java Nested Class.                 
                                           - Java Enum.                 
                                           - Java Dynamic Proxy. 

The class can implement to multiple interfaces but cannot if these interfaces have any similar methods. 
The interface can extends  multiple interfaces. 

If we have a subclass that extends from a superclass and implement to the interface 
and they ( the interface and the super class ) have a similer mathod but do a diffirent job
the object from the subclass will invoke (if we want)the method of the suberclass not the interface. 

From the version of JDK 1.8 and the latest 
                                          - we can use the "default" keyword in declaring the method in the interface
                                            if we want to add a concrete method (feature) in the interface class.
                                          - We can also use the "static" keyword to make a concrete method in the interfaces.  
                                          - We should know that the default method must be public if we want to make overriding on it.
                                          - In JDK 9 we can make a private method in the interface and invoke it in the default method.  
                                          
The nested interface : is used to groupe related interfaces. In implementation we write in the class decleration (outerinterface.innerinterface).

The functional interface : Is the interface that have a single method.

Marker or tagging Interface : An empty interface is known as tag or marker interface.For example Serializable,EventListener,Remote(java.rmi.Remote)
                              are tag interface.
    What are the benefits of the Marker or tagging Interface ?!
                                                            - This make me able to do special things according to certain conditions 
                                                            - We use this type of interface with files (will be mentioned later)

Why, When and benefits of interfaces ?!
                                       - To achive Security - hide certain details and only show the important details of an object (interface).
                                       - java doesn't support"multiple inheritance " (a class can only inheriit from one superclass ).
                                         However, it can be achieved with interfaces, because the class can implement multiple interfaces. 
                                       - Interface can extend an interface and can also extend multiple interfaces.
                                       - Loose Coupiling (Make classes are independent) 

 */

public class Main {
    public static void main (String [] args){
      CareV1 C1 = new CareV1(); 

      if(C1 instanceof MarkerInterface) // One the benefits. 
        System.out.println("yes");
      else 
        System.out.println("No");
    }
}
