import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CoachingCenterManagementSystem extends JFrame
{
    private List<Student1> students;

    private JTextField nameTextField, courseTextField;
    private JTextArea displayTextArea;

    public CoachingCenterManagementSystem() {
        students = new ArrayList<>();

        setTitle("Coaching Center Management System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initializeComponents();
    }

    private void initializeComponents() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        nameTextField = new JTextField(20);
        courseTextField = new JTextField(20);

        JButton registerButton = new JButton("Register Student");
        JButton displayButton = new JButton("Display Students");

        displayTextArea = new JTextArea(10, 30);
        displayTextArea.setEditable(false);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerStudent1();
            }
        });

        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayStudents();
            }
        });

        panel.add(new JLabel("Name:"));
        panel.add(nameTextField);
        panel.add(new JLabel("Course:"));
        panel.add(courseTextField);
        panel.add(registerButton);
        panel.add(displayButton);
        panel.add(new JScrollPane(displayTextArea));

        add(panel);
    }

    private void registerStudent1() {
        String name = nameTextField.getText();
        String course = courseTextField.getText();

        if (!name.isEmpty() && !course.isEmpty()) {
            students.add(new Student1(name, course));
            JOptionPane.showMessageDialog(this, "Student registered successfully.");
            nameTextField.setText("");
            courseTextField.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Please enter both name and course.");
        }
    }

    private void displayStudents() {
        displayTextArea.setText("");
        if (students.isEmpty()) {
            displayTextArea.append("No students registered yet.");
        } else {
            for (Student1 student : students) {
                displayTextArea.append(student.toString() + "\n");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CoachingCenterManagementSystem().setVisible(true);
            }
        });
    }    
}
