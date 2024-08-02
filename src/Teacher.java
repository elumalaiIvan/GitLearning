public class Teacher extends Employee {
    private String subject;
    private int std;


    public Teacher(int id, String name, int age, String gender, String role, double salary, String subject, int std) {
        super(id, name, age, gender, role, salary);
        this.subject = subject;
        this.std = std;
    }
    public void displayTeacherDetails() {
        System.out.println("subject: " + subject);
        System.out.println("std: " + std);
    }



}
