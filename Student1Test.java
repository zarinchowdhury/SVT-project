import static org.junit.jupiter.api.Assertions.*;
public class Student1Test {
    public static void main(String[] args) {
        // Create Student1 instances
        Student1 student1 = new Student1("Alice", "Computer Science");
        Student1 student2 = new Student1("Bob", "Mathematics");

        // Print student details
        System.out.println(student1); // Expected: Name: Alice, Course: Computer Science
        System.out.println(student2); // Expected: Name: Bob, Course: Mathematics

        // Simple manual checks
        if (!student1.toString().equals("Name: Alice, Course: Computer Science")) {
            System.out.println("Test failed for student1.");
        } else {
            System.out.println("Test passed for student1.");
        }

        if (!student2.toString().equals("Name: Bob, Course: Mathematics")) {
            System.out.println("Test failed for student2.");
        } else {
            System.out.println("Test passed for student2.");
        }
    }
}
