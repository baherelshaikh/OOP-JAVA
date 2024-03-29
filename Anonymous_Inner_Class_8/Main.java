/*
 
Anonymous class enable you to make your code more concise.
They enable you to declare and instantiate a class at the same time.
They are like local classes expect that they 
do not have a name . Use them if you need to use a local class only once.
In simple words, a nameless inner class is called anonymous inner class.

We will use it in "listener interfaces" in grafics programming.

We may use jave anonymous classes in 3 ways :
                                             - Anonmous inner class that extends a class (may be abstract or concrete).
                                             - Anonymous inner class that implements an interface.
                                             - Anonymous class that defined as arguments of methods / constructor.
                                             - We cannot make a constructor in the Anonymous Class BUT we can invoke the constructor of the super class in it
                                               (invoke the argument/no argument constructor and Blocks of the super class first 
                                                and then do what is existed in the anonymousclass ""WHATEVER IT IS. ""). 
....
......
.........
 */

public class Main {
    public interface Showable {
        void print(int x);
    } 
    
    public interface Showable11 {
        void print();
    } 

    static void display(Showable11 s){
        s.print();
    }
    public static void main(String [] args){
        RewardClass emp1 = new RewardClass(); // Output is 10$.
        RewardClass emp2 = new RewardClass(); // Output is 10$.
        
        // 1st Way :
                    RewardClass emp3 = new RewardClass(){ // This is the way of writing the Anonymous class
                        @Override
                        void rewardMethod() {
                            System.out.println("YOUR REWARD IS 20$.");
                        }
                    }; // Output is 20$.

                    //OR
                      new RewardClass(){ // This is the way of writing the Anonymous class
                        @Override
                        void rewardMethod() {
                            System.out.println("YOUR REWARD IS 20$.");
                        }
                    }.rewardMethod(); 


                    

        // 2nd Way :
                    Showable showable = new Showable(){
                        @Override
                        public void print(int x) {
                            System.out.println("SHOWABLE"+x);
                        }
                    }; 
                    
                    //OR
                    new Showable(){
                        @Override
                        public void print(int x) {
                            System.out.println("SHOWABLE"+x);
                        }
                    }.print(0); 


        // 3rd Way :
                    Showable showable1 ;
                    showable1 = (y) -> { // LAMDA is used only with interface and just when the interface has single method.
                        {
                            System.out.println("SHOWABLE"+y);
                        }
                    }; 
     
        // 4th Way :
                    display( new Showable11(){
                        @Override
                        public void print() {
                            System.out.println("SHOWABLE11");
                        }
                    });

        // 5th Way :
                    TestClass test = new TestClass(){ //invoke the No argument constructor.
                        @Override
                        public void testmethod() {
                            System.out.println(this.getClass());
                        }
                    };

                    //OR
                    TestClass test1 = new TestClass(5){ //invoke the argument constructor.
                        @Override
                        public void testmethod() {
                            System.out.println(this.getClass());
                        }
                    };
    }

}
