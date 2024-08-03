import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Malai", 32, "M");
        person.displayBasicDetails();
        System.out.println(" \n ======= \n");

        AbstractList<Integer> list = new ArrayList<>();

       // is A type relationship
        Person employee = new Employee(1, "malai", 32, "M", "dev", 100.0);
        employee.displayBasicDetails();

        System.out.println(" \n ======= \n");


        Student student = new Student(1, "keerthi", 34, "F", 1);
        student.displayBasicDetails();

//        Teacher teacher = new Teacher(100, "niranjan", 40, "M", "Senior teacher", 10000, "Tamil", 4);
//        teacher.displayBasicDetails();
//        teacher.displayEmployeeDetails();
//        teacher.displayTeacherDetails();

    }
}
