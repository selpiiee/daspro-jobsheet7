import java.util.Scanner;

public class SiakadFor21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double grade, highest=0, lowest=100;
        int pass = 0, notpassed = 0;

        for (int i = 1; i <= 10;) {
            System.out.print("Enter the student's grade to-" + i + ": ");
            grade = sc.nextDouble();
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
            if (grade >= 60) {
                pass++;
            } else {
                notpassed++;
            }
            i++;
        }

        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        System.out.println("The number of students who passed: " + pass);
        System.out.println("The number of students who not passed: " + notpassed);
        }
        }