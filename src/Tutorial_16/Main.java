package Tutorial_16;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Jim", "Ol", "20 Banana Lane, Dublin, Ireland", 1, 2.5);
        student.display();
        System.out.printf("%n");
        Employee employee = new Employee("Pim", "Berry", "34th Street, Upper Lane, Kerry, Ireland", 1023, "Accountant");
        employee.display();
    }
}
