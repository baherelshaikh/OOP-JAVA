package Interface_6;

public class CareV1 implements MarkerInterface,Movable, SelefDrivable {
    private int x,y, numberOfPassengers ;

    

    public CareV1() {
    }

    public CareV1(int x, int y, int numberOfPassengers) {
        this.x = x;
        this.y = y;
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public void destination(String d) {
        System.out.println("destination = "+d);        
    }

    @Override
    public void drive() {
        System.out.println("drive");        
        
    }

    @Override
    public void moveUp() {
        y--;        
    }

    @Override
    public void moveDown() {
        y++;        
    }

    @Override
    public void moveRight() {
        x++;        
    }

    @Override
    public void moveLeft() {
        x--;        
    }

    

    
}
