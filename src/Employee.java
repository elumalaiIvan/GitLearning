public class Employee extends Person  {
  private int id;
  private String role;
  private double salary;

  public Employee(int id, String name, int age, String gender, String role, double salary) {
    super(name, age, gender);
    this.id = id;
    this.role = role;
    this.salary = salary;
  }

  public int getId() {
    return id;
  }

  public String getRole() {
    return role;
  }

  public double getSalary() {
    return salary;
  }

  public void displayEmployeeDetails() {
    System.out.println("id: " + id);
    System.out.println("role: " + role);
    System.out.println("salary: " + salary);
  }
}

