import java.util.Scanner;

public class CafeDoWhile21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int coffee, tea, bread;
        String customerName;
        double coffeePrice = 12000, teaPrice = 7000, breadPrice = 20000, totalPrice;

        do {
            System.out.print("Enter customer name (press 'cancel' to exit): ");
            customerName = sc.nextLine();
            if (customerName.equalsIgnoreCase("cancel")) {
                System.out.println("Transaction canceled.");
                break;
            }
            System.out.print("Number of coffees: ");
            coffee = sc.nextInt();
            System.out.print("Number of teas: ");
            tea = sc.nextInt();
            System.out.print("Number of breads: ");
            bread = sc.nextInt();
            totalPrice = (coffee * coffeePrice) + (tea * teaPrice) + (bread * breadPrice);
            System.out.println("Total amount payable: Rp " + totalPrice);
            sc.nextLine();
        } while (true);

        System.out.println("All transaction completed.");

        sc.close();
    }
}