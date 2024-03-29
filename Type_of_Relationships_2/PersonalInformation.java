package Type_of_Relationships_2;

public class PersonalInformation {
    private String firstName, middileName, lastName,boolGroup,accountNumber,natoinality;
    private int YearOfBieth;
    public PersonalInformation() {
    }
    public PersonalInformation(String firstName, String middileName, String lastName, String boolGroup,
            String accountNumber, String natoinality, int yearOfBieth) {
        this.firstName = firstName;
        this.middileName = middileName;
        this.lastName = lastName;
        this.boolGroup = boolGroup;
        this.accountNumber = accountNumber;
        this.natoinality = natoinality;
        YearOfBieth = yearOfBieth;
    }
    @Override
    public String toString() {
        return "PersonalInformation [firstName=" + firstName + ", middileName=" + middileName + ", lastName=" + lastName
                + ", boolGroup=" + boolGroup + ", accountNumber=" + accountNumber + ", natoinality=" + natoinality
                + ", YearOfBieth=" + YearOfBieth + "]";
    }

    

    
}
