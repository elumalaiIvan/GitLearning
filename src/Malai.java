public class Malai {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(2, 3);

        Subject s1=new Subject("math",80);
        Subject s2=new Subject("science",50);
        Subject s3=new Subject("ss",60);

        // address 100 -> 110
        Student student1 = new Student("ezhil", 001, 30, "IT", 100,s1,s2,s3);
        Student student2 = new Student("Nive", 004, 20, "Computer", 200);
        // address 111 -> 120


//       student1.printGrade();
//       student2.printGrade();
//



    }

    public static void print(String student) {
        System.out.println("welcome " + student);
    }
}
