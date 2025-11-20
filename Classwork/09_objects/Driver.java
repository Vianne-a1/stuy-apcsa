public class Driver {
    public static void main(String[] args) {
        Employee sara = new Employee("Sara", "manager", 50000);

        System.out.print(sara.getName());
        System.out.println(sara.getPosition());
        System.out.println(sara.getSalary());
        System.out.print("Expected life earnings: " + sara.avgLifeEarnings());
    }
}
