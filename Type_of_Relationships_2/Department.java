package Type_of_Relationships_2;

public class Department {
    private int dePtNO;
    private String DeptName;
    public Department() {
    }
    public Department(int dePtNO, String deptName) {
        this.dePtNO = dePtNO;
        DeptName = deptName;
    }
   
    public int getDePtNO() {
        return dePtNO;
    }
    public void setDePtNO(int dePtNO) {
        this.dePtNO = dePtNO;
    }
    public String getDeptName() {
        return DeptName;
    }
    public void setDeptName(String deptName) {
        DeptName = deptName;
    }
    @Override
    public String toString() {
        return "Department [dePtNO=" + dePtNO + ", DeptName=" + DeptName + "]";
    }
}
