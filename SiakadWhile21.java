import java.util.Scanner;

public class SiakadWhile21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int grade, amnt, i = 0;

        System.out.println("Enter the number of students: ");
        amnt = sc.nextInt();

        while (i < amnt) {
            System.out.print("Enter the student's grade to-: ");
            grade = sc.nextInt();

            if (grade < 0 || grade > 100) {
                System.out.println("Invalid value. Enter valid value again!");
                continue;
            }

            if (grade > 80 & grade <= 100) {
                System.out.println("Student's grade to-" + (i + 1) + " is A." + " Great, keep up the grade!");
            } else if (grade > 73 && grade <= 80) {
                System.out.println("Student's grade to-" + (i + 1) + " is B+");
            } else if (grade > 65 && grade <= 73) {
                System.out.println("Student's grade to-" + (i + 1) + " is B");
            } else if (grade > 60 && grade <= 65) {
                System.out.println("Student's grade to-" + (i + 1) + " is C+");
            } else if (grade > 50 && grade <= 60) {
                System.out.println("Srudent's grade to-" + (i + 1) + " is C");
            } else if (grade > 39 && grade <= 50) {
                System.out.println("Student's grade to-" + (i + 1) + " is D");
            } else {
                System.out.println("Student's grade to-" + (i + 1) + " is E");
            } 
            i++;
        }
    }
}