public class Employee {
  public  String name;
  String role;
  public int age;
  double salary;
  int bonus;

public int getbonus  (int age)
{
  int bonus=0;
  if(age==30)
    bonus=10000;
    if (age==20)
      bonus=5000;
    return bonus;

}

}
