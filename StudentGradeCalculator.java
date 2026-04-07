import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= subjects; i++) {
            int marks;

            while (true) {
                System.out.print("Enter marks for subject " + i + " (0-100): ");
                marks = sc.nextInt();

                if (marks >= 0 && marks <= 100) {
                    break;
                } else {
                    System.out.println("Invalid marks! Please enter between 0 and 100.");
                }
            }

            totalMarks += marks;
        }

        double average = (double) totalMarks / subjects;

        char grade;
        String message;

        if (average >= 90) {
            grade = 'A';
            message = "Excellent";
        } else if (average >= 75) {
            grade = 'B';
            message = "Very Good";
        } else if (average >= 60) {
            grade = 'C';
            message = "Good";
        } else if (average >= 50) {
            grade = 'D';
            message = "Average";
        } else {
            grade = 'F';
            message = "Fail";
        }

        System.out.println("\n----- RESULT -----");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("Performance: " + message);

        sc.close();
    }
}
