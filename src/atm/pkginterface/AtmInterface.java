
package atm.pkginterface;
import java.util.Scanner;

public class AtmInterface {

    private static int balance = 100000;  // Initial balance

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            displayMenu();
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    performWithdrawal(sc);
                    break;
                case 2:
                    performDeposit(sc);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("Automated Teller Machine");
        System.out.println("Choose 1 for Withdraw");
        System.out.println("Choose 2 for Deposit");
        System.out.println("Choose 3 for Check Balance");
        System.out.println("Choose 4 for EXIT");
        System.out.print("Choose the operation you want to perform: ");
    }

    private static void performWithdrawal(Scanner sc) {
        System.out.print("Enter amount to withdraw: ");
        int withdrawAmount = sc.nextInt();

        if (withdrawAmount > 0 && withdrawAmount <= balance) {
            balance -= withdrawAmount;
            System.out.println("Please collect your money.");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
        System.out.println();
    }

    private static void performDeposit(Scanner sc) {
        System.out.print("Enter amount to deposit: ");
        int depositAmount = sc.nextInt();

        if (depositAmount > 0) {
            balance += depositAmount;
            System.out.println("Your money has been successfully deposited.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
        System.out.println();
    }

    private static void checkBalance() {
        System.out.println("Your balance: " + balance);
        System.out.println();
    }
}
