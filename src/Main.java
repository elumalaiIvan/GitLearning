public class Main {
    public static void main(String[] args) {
Employee nive=new Employee();
nive.name="nivedida";
nive.role="Manager";
nive.age=30;
//nive.salary= 50000;


nive.bonus=nive.getbonus(nive.age);
        System.out.println(nive.bonus);


Employee Kani = new Employee();
Kani.role = "Developer";
//Kani.salary = 40000;




System.out.println(nive.role);
System.out.println(Kani.role);

        Student a1 = new Student("KAVI", 6, 'F', "1st");

        System.out.println("Name: " + (a1.getName()));
        System.out.println("Age: " + (a1.getAge()));
        System.out.println("Gender: " + (a1.getGender()));
        System.out.println("Grade: " + (a1.getGrade()));


        //a1.setName("sham");







    }
}
