public class Student extends Person {
    private String university;
    private int course;

    public Student(String name, int age, String gender, String university, int course) {
        super(name, age, gender); 
        this.university = university;
        this.course = course;
    }

    @Override
    public void work() {
        System.out.println("University: " + university + ", Course: " + course);
        System.out.println("Student is studying");
    }
}