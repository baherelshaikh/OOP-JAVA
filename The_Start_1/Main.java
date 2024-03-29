public class Main {
    static void fun(Test_3 n){
        n.number++;
    }
    public static void main (String [] args ) // the method main is created as static because this will not make JVM have to make an object to deal with it 
    {
        // Car_1 car1 = new Car_1();
        Student_2 student1 = new Student_2("Baher", "123");
        // Student_2 student2 = new Student_2("Ahmed", "891");
        // Student_2 student3 = new Student_2("Mohamed", "567");
        System.out.println(student1.logIn(1,"123"));
      //  Student_2.InnerClass obj = new Student_2.InnerClass(); // The way of calling the inner class
        // call by reference 
        Test_3 obj1 = new Test_3();
        obj1.number= 10;
        Test_3 obj2 = new Test_3();
        obj2.number= 10;
        fun(obj1);
        System.out.println("number = "+ obj1.number);
        // returnning object
        Test_3 obj3 = Test_3.add(obj1,obj2);
        System.out.println("number of obj3= "+obj3.number);
        //comparing object
        System.out.println(Test_3.isEqual(obj1, obj2));


        // Polymorphism

        employee_Polymorphism_5 e1 = new employee_Polymorphism_5("Ahmed","Egypt","CS","afsd@gmail.com",3000);
        System.out.println("E1 Salary = "+ e1.getSalary());

        SalaryEmployee e2 = new SalaryEmployee("Ahmed","Egypt","CS","afsd@gmail.com",3000,200);
        System.out.println("E2 Salary = "+ e2.getSalary()); // It will call the method which is written in the super class (employee_Polymorphism_5) because we inheritanced from this class 
        
        DialyEmpolyee e3 = new DialyEmpolyee("Ali", "mashal", "IT","afsd@gmail.com",0,15,20);
        System.out.println("E3 Salary = "+ e3.getSalary());
             // We can use the object which is from the super class to creat objects from the subclasses ( actually we turning the type of the object from the super class
             // into one of subclasses we want ) by this way to benefit from overriding 
        e1= new SalaryEmployee("Ahmed","Egypt","CS","afsd@gmail.com",3000,200);
           // here the object became from the SalaryEmployee class 
           // So after that the object e1 able to access the methods in the super class(which is created from) and the methods which is shared
           // between this class and the new class (SalaryEmployee) and after that the object e1 is called polymorphic                              

    }
}