package Type_of_Relationships_2;

public class Employee {
    private int id;
    private float salary;
    private PersonalInformation personalInfo; // relationship composition or aggrgation ? just we creat an obbject in a class from another class that means one of these relationships 
    private Department dept; // relationship composition or aggrgation ? just we creat an obbject in a class from another class that means one of these relationships
    
    public Employee(int id, float salary,String firstName, String middileName, String lastName, String boolGroup, String accountNumber, String natoinality,
                    int yearOfBieth, Department dept) {
        this.id = id;
        this.salary = salary; 
        this.personalInfo = new PersonalInformation( firstName,  middileName, lastName, boolGroup, accountNumber, natoinality, yearOfBieth); // after that it became a composition relationship(part-of) 
        this.dept = dept;
    }

    @Override
    public String toString() { // We should know if we call (the name the object only) or (the name of the object.toString) it will call the method toString if it is exisited
        return "Employee [id=" + id + ", salary=" + salary + ", personalInfo=" + personalInfo + ", dept=" + dept + "]";
    }
    
    
}
