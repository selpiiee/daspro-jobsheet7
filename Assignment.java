
import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Choose: ");
        int Task = sc.nextInt();

        switch (Task) {
            case 1:
                Question.G();
                break;
            case 2:
                Question.F();
                break;
            default:
                System.out.println("Invalid!");
                ;
        }

    }
}

class Question {

    static void G() {
        Scanner sc = new Scanner(System.in);

        int customers, ticketCount, totalTicketSold = 0, i = 0;
        double ticketPrice = 50000, totalPrice = 0, totalSales = 0, discount;

        System.out.print("Enter the number of customers: ");
        customers = sc.nextInt();

        while (i < customers) {
            System.out.print("Enter the numbers of tickets bought by customers " + (i + 1) + ": ");
            ticketCount = sc.nextInt();

            if (ticketCount < 0) {
                System.out.println("Invalid input. Please enter a posistive number!");
                continue;
            }
            
            totalPrice = ticketPrice * ticketCount;

            if (ticketCount > 10) {
                discount = 0.15;
            } else if (ticketCount > 4) {
                discount = 0.1;
            } else {
                discount = 0;
            }

            totalPrice -= totalPrice * discount;

            System.out.println("Total price for customer " + (i + 1) + ": Rp" + totalPrice);
            totalSales += totalPrice;
            totalTicketSold += ticketCount;

            i++;
        }
        System.out.println("\n===DAILY SALES REPORT===");
        System.out.println("Total ticket sold: " + totalTicketSold);
        System.out.println("Total sales: Rp" + totalSales);

        sc.close();
    }

    static void F() {
        Scanner sc = new Scanner(System.in);

        int type, duration, total = 0, i = 1;

        System.out.println("===Parking System===");
        System.out.println("Type: 1 = Car, 2 = Motorcycle, 0 = Exit");

        do {
            System.out.print("Enter vehicle type (1/2/0 to exit): ");
            type = sc.nextInt();

            if (type == 0) {
                break;
            } else if (type != 1 && type != 2) {
                System.out.println("Invalid vechile type! Try again.\n");
                continue;
            }

            System.out.println("Enter duration parking (hours): ");
            duration = sc.nextInt();

            if (duration > 5) {
                total += 12500;
            } else if (type == 1) {
                total += duration * 3000;
            } else if (type == 2) {
                total += duration * 2000;
            }
            i++;

        } while (true);

        System.out.println("Total parking fee: Rp " + total);
        sc.close();
    }
}