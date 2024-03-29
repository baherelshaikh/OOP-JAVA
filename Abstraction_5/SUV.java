package Abstraction_5;

public class SUV extends Care {

    private int x;
    
    public SUV() { // SUV is a type of cars 
    }

    public SUV(float height, float weight, int numberOfWheels, int x) {
        super(height, weight, numberOfWheels);
        this.x = x ;
    }

    @Override
    void autopilot() {
        System.out.println("SUV autopilot");
        
    }

    @Override
    void streamingServices() {
        System.out.println("SUV streamingServices");
        
    }

    @Override
    void parckingSensor() {
        System.out.println("SUV parckingSensor");
        
    }

    void m1 (){
        System.out.println("I'm only existed in the subclass ");
    }
}
