package Final_Keyword_3;
// 1- final variable    2- final Parameter   3- final Method    4- final Class   5- final Reference
// final(constant or const) : Is a ((non-access modifier)) and it is a keyword which is used to make the thing take a value for one time and we can not change this value again by anyway 
//  the thing which is created as a final we can give it a value thogh intualization or in a block or constructor  

public class Student { // Final class : is a class which another class can't inheritance from it, so if we write a word final for this class the word extends  
                       //               in GraduatedStudent (subclass) will give error, we can write the word before or after the access modifier as we want
    final int STUDENT_ID ;
    String name;
    int yearOfBirth;
    final static float DEGREE_OF_SUCCESS;

    static{
        DEGREE_OF_SUCCESS = 60; // It became static blank final variable : the word blank means that we give the value later on (not at the same time we create it)
                               //  and this type we give the value of variable just in a static block  
    }

    public Student(final int  STUDENT_ID, String name, int yearOfBirth) { // Final Parameter is a parameter we can't change, we put it as we take it  
        this.STUDENT_ID = STUDENT_ID;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    final public String toString() { // the methods which is created as final we can not make overriding on it in the subclasses
        return "Student [STUDENT_ID=" + STUDENT_ID + ", name=" + name + ", yearOfBirth=" + yearOfBirth + "]";
    }
    
}

class GraduatedStudent extends Student { // if a class is written as a public it must be written in a different file (there is one public class at a file )

    public GraduatedStudent(int STUDENT_ID, String name, int yearOfBirth) {
        super(STUDENT_ID, name, yearOfBirth);
    } 
  
  
    /* @Override
     public String toString() {
        return "Student [STUDENT_ID=" + STUDENT_ID + ", name=" + name + ", yearOfBirth=" + yearOfBirth + "]";
    }  */ // it will give an error

}
