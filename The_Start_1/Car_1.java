public class Car_1 {
    private String name ;
    private int maxSpead ;
    private float price ;
    private int model;
    // no parameter constructor
    public Car_1 (){ }
    // prameterized constructor
    public Car_1(String n, int m, float p, int mo ) {
        this (n,m,p); //constructor chaining : Is calling a constructor inside another 
        model = mo;

    }
    // prameterized constructor
    public Car_1(String n, int m, float p) {
        name = n ;
        maxSpead = m;
        price = p ;

    }
    //copy constructor 
    public Car_1(Car_1 p1){
        this(p1.name, p1.maxSpead,p1.price, p1.model);
    } 

    //Setters & Getters
    public void setName(String n)
    {
        name = n;
    }
    public void setMaxSpead (int m){
        maxSpead = m ;
    }
    public void setPrice(float p){
        price = p ;
    }
    public void setModel (int m)
    {
        model = m;
    }
    public String getName()
    {
        return name;
    }
    public int getMaxSpead(){
        return maxSpead;
    }
    public float getPrice(){
        return price;
    }
    public int getModel(){
        return model;
    }


    // Finalizer (destructor) : Is a method which JVM automatically call after the end of programme excution, it works on delet the unused objects and free up the memory
}
