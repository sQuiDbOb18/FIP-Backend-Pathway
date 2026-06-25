package task6;

interface Message {
    void showMessage();
}

public class StudentProfile {
    public String studentName;
    private int studentAge;

    public StudentProfile(String studentName, int studentAge) {
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public void showStudent() {
        System.out.println("Student name: " + studentName);
        System.out.println("Student age: " + studentAge);
    }

    class Course {
        String courseName;

        public Course(String courseName) {
            this.courseName = courseName;
        }

        public void showCourse() {
            System.out.println("Course: " + courseName);
            System.out.println(studentName + " is learning " + courseName);
        }
    }

    public static void main(String[] args) {
        StudentProfile student = new StudentProfile("James", 20);
        student.showStudent();

        StudentProfile.Course course = student.new Course("Java Backend");
        course.showCourse();

        Message message = new Message() {
            public void showMessage() {
                System.out.println("This message is from an anonymous class.");
            }
        };

        message.showMessage();
    }
}
