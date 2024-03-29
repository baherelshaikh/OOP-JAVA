// polymorphism : which mean many forms it appears in overloading (Early binding"Static Polymorphism"--->> compile-time) and overriding (late binding"Dynamic binding"--->> run-time)
// We Mentioned overloading before so we will talk about 
// overriding  

public class employee_Polymorphism_5 {
    private String name, address, department, email;
    private float salary ;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public employee_Polymorphism_5(String name, String address, String department, String email, float salary) {
        this.name = name;
        this.address = address;
        this.department = department;
        this.email = email;
        this.salary = salary;
    }
    public employee_Polymorphism_5() {
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
     
}

// Polymorphism (Generic) Array Types : Is making an array which receve object and store diffrent data type at the same time (we will mention it later) 

