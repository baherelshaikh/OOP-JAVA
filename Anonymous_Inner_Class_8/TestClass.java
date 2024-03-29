public class TestClass {
    TestClass(){
        System.out.println("No ARGUMENT COSTRUCTOR");
    }
    TestClass(int x){
        System.out.println("PARAM CONSTRUCTOR"+x);
    }

    public void testmethod(){
        System.out.println(this.getClass());
    }
}
