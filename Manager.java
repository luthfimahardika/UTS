public class Manager extends Employee {
    private String department;
    private int teamSize;

    public Manager(String name, int age, String address, String id, double salary, String department, int teamSize) {
        super(name, age, address, id, salary); // Memanggil constructor kelas induk (Employee)
        this.department = department;
        this.teamSize = teamSize;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTimeSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public void addTeamMember() { // Metode untuk menambah anggota tim
        teamSize++;
        System.out.println("Team Size after add member  : " + teamSize);
    }

    public void displayManagerInfo() {
        displayEmployeeInfo(); // Memanggil metode dari kelas Employee
        System.out.println("Department              : " + department);
    }
}
