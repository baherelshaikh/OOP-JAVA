//The relationships in OOP 
// 1- Is-a which was mentioned in the chapter of Inheritance
// 2- Association : When we use an object without creating it (it is already existed) in a class from another class just to do some thing and that is the abstract meaning 
//                  but if we create the object (because it is not existed) in this case we find two types(another meanings ) of Association
//  A- Aggregation(has-a) : In this type the relationship is weak because if one of the objects destroyed the second will destroy and it is written like this( Whole <>---- part of) 
//                          and in code we should create the part (small) outside the whole (big) so if anyone destroy the second won't destroy
//  B- composition(part-of) : In this type the relationship is strong because we create the part in the whole so if anyone destroy the second will destroy and it is 
//                            written like this (whole <>--- part)but But the arrowhead is shaded  

package Type_of_Relationships_2;

public class Main {
    public static void main (String [] args)
    {
        // Aggregation relationship
        Department dept = new Department(123,"IT"); 
        Employee emp1 = new Employee(1, 3000, "Ahmed", "Ali", "Belal", "A+", "11222334455", "Egyption", 1996, dept);
        Employee emp2 = new Employee(1, 3000, "Ali", "Ahmed", "Belal", "O+", "11222334455", "Egyption", 1996, dept);
        Employee emp3 = new Employee(1, 3000, "Belal", "Ahmed", "Belal", "B+", "11222334455", "Egyption", 1996, dept);
           // So the last 4 lines show that the one department has 3 employees (we can  store the 3 employees by using array list) 
        System.out.println(emp1);
    }
    
}
