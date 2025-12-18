import java.util.Scanner;

public class ConsoleATM {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double currentBalance = 0.0;

        while (true) {
            // Display Menu
            System.out.println("\nWelcome to the Simple Console ATM!");
            System.out.println("Please select an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Funds");
            System.out.println("3. Withdraw Funds");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    // Check Balance
                    System.out.println("Your current balance is: " + currentBalance + " taka");
                    break;

                case 2:
                    // Deposit Funds
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();

                    if (depositAmount > 0) {
                        currentBalance += depositAmount;
                        System.out.println("Deposit successful!");
                        System.out.println("Updated balance: " + currentBalance + " taka");
                    } else {
                        System.out.println("Invalid amount! Deposit must be greater than zero.");
                    }
                    break;

                case 3:
                    // Withdraw Funds
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();

                    if (withdrawAmount <= 0) {
                        System.out.println("Invalid amount! Withdrawal must be greater than zero.");
                    }
                    else if (withdrawAmount > 100) {
                        System.out.println("Withdrawal limit exceeded! Maximum 100 taka per transaction.");
                    }
                    else if (withdrawAmount > currentBalance) {
                        System.out.println("Insufficient balance!");
                    }
                    else {
                        currentBalance -= withdrawAmount;
                        System.out.println("Withdrawal successful!");
                        System.out.println("Remaining balance: " + currentBalance + " taka");
                    }
                    break;

                case 4:
                    // Exit
                    System.out.println("Thank you for using the ATM! Goodbye.");
                    scanner.close();
                    return;

                default:
                    // Invalid Option
                    System.out.println("Invalid selection! Please choose a valid option.");
            }
        }
    }
}
