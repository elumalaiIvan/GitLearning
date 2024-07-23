public class Malai {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(2, 3);
        // address 100 -> 110
        Student student1 = new Student("ezhil", 001, 30, "IT", 100);
        Student student2 = new Student("Nive", 004, 20, "Computer", 200);
        // address 111 -> 120
        Student student3 = new Student("Parvathi", 003, 20, "Computer", 300);
        Student student4 = new Student("keerthi", 002, 20, "Computer", 400);
        Student student5 = new Student("Malai", 003, 20, "Computer", null);


//       student1.printGrade();
//       student2.printGrade();
//       student3.printGrade();
       student4.printGrade();
//       student5.printGrade();




    }

    public static void print(String student) {
        System.out.println("welcome " + student);
    }
}
