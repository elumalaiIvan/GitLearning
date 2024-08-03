public class Person {
    private String name;
    private int age;

    public String getGender() {
        return gender;
    }

    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void displayBasicDetails() {
        System.out.println("Person specific details");

        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("gender: " + gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
