package universityenrollmentsystem;

public class Administrator extends Person{
    private String department;
    private String role;

    public Administrator(String name, String surname){
        super(name, surname);
    }
    public String getDepartment(){
        return department;
    }
    public void  setDepartment(String department){
        this.department = department;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role){
        this.role = role;
    }
    @Override
    public String toString(){
        return super.toString() + "Administrator - Department:"+ department +"Role:"+ role;
    }
}
