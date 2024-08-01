public class Teacher {
    String name;
    int id;
    String subject;
    int Std;
    char sec;
    String school;


    public Teacher(String name, int id, String subject, int std, char sec,String school) {
        this.name = name;
        this.id = id;
        this.subject = subject;
        Std = std;
        this.sec = sec;
        this.school=school;
    }
    public void printTeacher(){
        System.out.println("Name"+name);
        System.out.println("Id"+id);
        System.out.println("Subject" + subject);
        System.out.println("Std" + Std);
        System.out.println("Sec" + sec);
        System.out.println("School" + school);
    }
}
