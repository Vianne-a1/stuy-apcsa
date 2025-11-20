public class Teacher extends Person{
    private String department;

    public Teacher (String fName, String lName, String addr, String dep) {
        super(fName, lName, addr);
        department = dep;
    }

    public String getDepartment () {
        return department;
    }

    public void setGradYear (String newInput) {
        department = newInput;
    }

}