public class Student1 {
     String name;
    String course;

    public Student1(String name, String course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Course: " + course;
    }
}

