public class SalaryEmployee extends employee_Polymorphism_5 {
    private float bouns;

    public SalaryEmployee(String name, String address, String department, String email, float salary, float bouns) {
        super(name, address, department, email, salary);
        this.bouns = bouns;
    }

    public SalaryEmployee(float bouns) {
        this.bouns = bouns;
    }

    public float getBouns() {
        return bouns;
    }

    public void setBouns(float bouns) {
        this.bouns = bouns;
    }

    // overriding
    @Override
    public float getSalary() {
        return super.getSalary() + bouns;
    } // --->> We can not make override for methods which is created as a static method
    
}
