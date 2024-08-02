public class Teacher {
    private String name;
    private int id;
    private String subject;
    private int std;
    private char sec;
    private String school;

    public Teacher(String name, int id, String subject, int std, char sec, String school) {
        this.name = name;
        this.id = id;
        this.subject = subject;
        this.std = std;
        this.sec = sec;
        this.school=school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getStd() {
        return std;
    }

    public void setStd(int std) {
        this.std = std;
    }

    public char getSec() {
        return sec;
    }

    public void setSec(char sec) {
        this.sec = sec;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void printTeacher(){
        System.out.println("Name"+name);
        System.out.println("Id"+id);
        System.out.println("Subject" + subject);
        System.out.println("Std" + std);
        System.out.println("Sec" + sec);
        System.out.println("School" + school);
    }

}
