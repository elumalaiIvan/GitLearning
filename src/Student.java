public class Student extends Person {
    private int grade;
    private int id;

    public Student(int id, String name, int age, String gender, int grade) {
        super(name, age, gender);
        this.id = id;
        this.grade = grade;
    }

    public void displayStudentDetails() {
        System.out.println("id: " + id);
        System.out.println("grade: " + grade);

    }
}
