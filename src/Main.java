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


    }
}
