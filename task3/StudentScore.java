package task3;

public class StudentScore {
    String studentName;
    int score;
    int passMark;

    public StudentScore(String studentName, int score) {
        this.studentName = studentName;
        this.score = score;
        this.passMark = 50;
    }

    public void checkResult() {
        System.out.println("Student name: " + studentName);
        System.out.println("Score: " + score);

        if (score >= passMark) {
            System.out.println("Result: Passed");
        } else {
            System.out.println("Result: Failed");
        }
    }

    public static void main(String[] args) {
        StudentScore student1 = new StudentScore("James", 68);
        StudentScore student2 = new StudentScore("Peter", 42);

        student1.checkResult();
        System.out.println();
        student2.checkResult();
    }
}
