import java.util.Scanner;

public class GradeCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Enter total number of subjects to calculate thier marks
        
        System.out.println("Enter total number of subjects");
        int numSubjects = scan.nextInt();
        int totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.println("Enter marks for subject" + i + "( out of 100):");
            int marks = scan.nextInt();

            while (marks < 0 || marks > 100) {
                System.out.println("Invalid marks.Please enter the maeks between 0 & 100");
                System.out.println("Enter marks for subjects" + i + "out of 100");
                marks = scan.nextInt();
            }
            totalMarks += marks;
        }

        System.out.println("Student Reuslt:");
        System.out.println("Total marks obtained in all subjects:" + totalMarks);
        // Calculate percentage

        int averagePercentage = totalMarks/numSubjects;
        System.out.println("averagePercentage:"+averagePercentage);
        scan.close();
    }
}
