// call by reference && call by value && passing objects to methods && returnnig objects

// we can not use call by reference with the Primitive data types 
// So if we want to do that we have to send the adress of the variable
// And to make that we craete a class and create the variable in this class and then create an object from this class after that we deal with the variable by this object using call by reference 

public class Test_3 {
    int number;


    public static Test_3 add(Test_3 n1, Test_3 n2) {
        Test_3 obj3 = new Test_3 ();
        obj3.number= n1.number + n2.number ;
        return obj3 ;
    }
    //comparing object
    public static boolean isEqual(Test_3 n1, Test_3 n2){
        return (n1.number== n2.number);
    }
}