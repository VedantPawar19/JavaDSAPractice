package Day9;
import java.util.Scanner;

public class GradesOnMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = in.nextInt();
        String grade = grades(marks);
        System.out.println("Grade: " + grade);
        in.close();
    }

    static String grades(int m) {
        if (m > 100) {
            return "Marks cannot exceed 100. Enter Valid Marks (0-100).";
        } else if (m > 90) {
            return "AA";
        } else if (m > 80) {
            return "AB";
        } else if (m > 70) {
            return "BB";
        } else if (m > 60) {
            return "BC";
        } else if (m > 50) {
            return "CD";
        } else if (m > 40) {
            return "DD";
        } else if (m >= 0) {
            return "Fail";
        } else {
            return "Marks cannot be negative. Enter Valid Marks (0-100).";
        }
    }
}
