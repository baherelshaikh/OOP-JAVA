
// A static Word
//1- static variable
//1- static method
//3- static Block
//4- static class

public class Student_2 {
    private int no;
    private static int count=1 ;
    private String name;
    private String password ;
    private boolean loggedIn;
    private static int minimalpassword=6;

    // The 1st thing that Word "static" do is giving the value of variable to all the objects without a space memory to each one(just one space to the class) 
    // The 2nd thing that word "static" do is allow to call a variable or a method with the name of the class without make an object 
    // The third thing that word "static" do is make a variable is owned by only the class not by any object ---> the variable "count" will increase when create a new object
    private static String college= "IT" ;

    public Student_2(String name, String password ){
        this.no= count ;
        this.name= name ;
        this.password = password ;
        count ++;
    }
    // This method was created as static to make a public service (not for a special object)
    // we should know that if the method is static we can not call any non static member or non static method directly in it 
    // the words "this" & "super" cannot be used in static context.
    // But we can create a non static variable in it 
    public static boolean validatepassword(String password){ 
        if (password.length() >= minimalpassword)
        return true;
        else 
        return false ;
    }

    public boolean logIn(int enterdNomber, String enterdPassword){
        if (enterdNomber==no && enterdPassword.equals(password)){
            loggedIn = true ;
            return true ;
        }else 
        return false ;

    }

    // static Block : Is a block which have the same characteristics of a static method plus its addition characteristics ( The static blocks will Implemented before the constructor )
    // we can make a number of blocks as we want, and if we make an initialization for a variable in it, it will be also static even we don't write the word static before it
    static {
        int x =5; // static variable
        System.out.println("static block");

    }
    
    // A static class 
    // A class can be made as a static only if it is a nested class(inner class)
    // If we need to create an object from a class which is non static we have to create an object frome the outer class first and then call the inner class 
    // But if we need to call the inner static class we don't have to create an object from the outer class we only create an object from the inner class in the "main" method 
    // by this way -----> outerclass.innerclass object's name = new outerclass.innerclass(); 
    public static class InnerClass{
        static int s=10;
        public void print(){
            System.out.println("S ="+ s);
        }
    }
    // why we need nested classes ?!!
    // 1- It icreases encapsulation
    // 2- It can lead to more readable and maintainable code 
    // 3- It is a way of logically grouping classes that are only used in one place 
}
