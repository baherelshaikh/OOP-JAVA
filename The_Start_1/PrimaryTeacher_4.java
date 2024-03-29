// Types of Inheritance && some access modifiers
// Types of Inheritance
// 1- Single inheritance : From a single class to another single class( B--> A)
// 2- Multilevel iheritance : From a class which inheritances from another class (C--> B --> A )
// 3- Hierarchical inheritance : when more one class inheritances from the same class ( B--> A)&&( C--> A) but java doesn't support this and if we want to do this in java we can use 
//    multiple interfaces to achieve multiple inheritances
// 4- Hybrid inheritace : java also dosen't support this because it is a type of multiple interfaces (B--> A <-- C)&&(B<-- D --> C)

// public class subClass extends super class --> by code
//                            |---> (Is-A) relationship


// the word super. make me able to access to all methods of the super class and super()--> to call the costrctor of the super class.
// if we write in the main metod a statement to print and write only the name of the object without .+any method it will print the method toString of this object.

// access modifiers 
// 1- public : Which allow us to access it from anywhere we want  
// 2- private : which allow us to access it only in the class which is created in 
// 3- protected : which allow us to access it in the class which is created in and the subclasses from it
// 4- package-private(default) : Which allow us to access it only in its package   

// --->> If we want to inheritance from a class which is in another package we have to import it by this way
//       import (name of package).(*or name of class we want inheritance from )     //without--> ()
// *--> for all classes in this package or name of class we want inheritance from
public class PrimaryTeacher_4 {
    
}
