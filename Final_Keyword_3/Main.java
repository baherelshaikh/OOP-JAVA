package Final_Keyword_3;

public class Main {

    static void fun(){
        final String s1 = "aa"; // Local Final variables just take a value in the same local space
                                // the local final variable can make performance 2.5 times more fast
    }

    public static void main (String [] arg){
        final Student s1 = new Student(123,"Ali",1997); // final reference we cant not modify it by anyway
        /*s1= new Student(524, "zzz", 2222);*/ // it will gave an error
        Student s2 = new Student(456,"Ahmed",1997);
        Student s3 = new Student(789,"Mohamed",1997);

        System.out.println("s1 = "+ s1.STUDENT_ID);
    }
    
}
