public class Employee {
    // private instance variables
    private String name;
    private String position;
    private double salary;

    // Constructor
    public Employee(String myName, String myPosition, double mySalary) {
        name = myName;
        position = myPosition;
        salary = mySalary;
    }

    // Accessor methods
    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    // Setters methods
    public void setPosition(String newPosition) {
        position = newPosition;
    }

    public void setSalary(int newSalary) {
        salary = newSalary;
    }

    // Other method
    public double avgLifeEarnings() {
        return salary * 40;
    }
}
