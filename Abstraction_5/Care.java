package Abstraction_5;
public abstract class Care {
    private float height ;
    private float weight ;
    private int numberOfWheels ;

    public Care (){}

    public Care(float height, float weight, int numberOfWheels) {
        this.height = height;
        this.weight = weight;
        this.numberOfWheels = numberOfWheels;
    }

    abstract void autopilot();

    abstract void streamingServices();

    abstract void parckingSensor();

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    
}
