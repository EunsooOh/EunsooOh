public class Manager {
    private String name;
    private String address;
    private int salary;
    private int rrn;

    public Manager(String name, String address, int salary, int rrn) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.rrn = rrn;
    }

    public void displayInfo() {
        System.out.println("name=" + name);
        System.out.println("address=" + address);
        System.out.println("salary=" + salary);
    }

    public void test() {
        displayInfo();
    }

    @Override
    public String toString() {
        return "Employee[name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
    }
}