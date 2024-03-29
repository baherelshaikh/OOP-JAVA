public class DialyEmpolyee extends employee_Polymorphism_5 {
    private float workDayPrice ;
    private int dilyRate;
    
    public DialyEmpolyee(String name, String address, String department, String email, float salary, float workDayPrice,int dilyRate) {
        super(name, address, department, email, salary);
        this.workDayPrice = workDayPrice;
        this.dilyRate = dilyRate;
    }

    public float getWorkDayPrice() {
        return workDayPrice;
    }

    public void setWorkDayPrice(float workDayPrice) {
        this.workDayPrice = workDayPrice;
    }

    public int getDilyRate() {
        return dilyRate;
    }

    public void setDilyRate(int dilyRate) {
        this.dilyRate = dilyRate;
    }

    @Override
    public float getSalary() {
        return workDayPrice*dilyRate;
    }
    
    
    
}
