public class Employee extends Person {
    private String id;
    private double salary;

    public Employee(String name, int age, String address, String id, double salary) {
        super(name, age, address); // Memanggil constructor kelas induk (Person)
        this.id = id;
        this.salary = salary;
    }

    public String getId() { 
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() { 
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void giveRaise(double percent) { // Metode untuk menaikkan gaji
        salary += salary * percent / 100;
        System.out.println("===========================================");
        System.out.println("New Salary after raise      : " + salary);
    }

    public void displayEmployeeInfo() {
        displayInfo(); // Memanggil metode dari kelas Person
        System.out.println("Employee ID             : " + id);
        System.out.println("Salary                  : " + salary);
    }
}
