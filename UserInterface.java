import java.util.Scanner;

public class UserInterface {
    Account[] accounts = new Account[100];
    int accountCount = 0;
    Scanner sc = new Scanner(System.in);

    // Create Account
    public void createAccount() {
        System.out.print("Enter Account Number: ");
        int accNum = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        // Create Account object
        accounts[accountCount] = new Account(accNum, name, balance);
        accountCount++;
        System.out.println("Account created successfully!");
    }

    // Deposit money
    public void depositMoney() {
        System.out.print("Enter Account Number: ");
        int accNum = sc.nextInt();
        System.out.print("Enter Amount to Deposit: ");
        double amount = sc.nextDouble();

        Account acc = findAccount(accNum);
        if (acc != null) {
            acc.deposit(amount);
        } else {
            System.out.println("Account not found!");
        }
    }

    // Withdraw money
    public void withdrawMoney() {
        System.out.print("Enter Account Number: ");
        int accNum = sc.nextInt();
        System.out.print("Enter Amount to Withdraw: ");
        double amount = sc.nextDouble();

        Account acc = findAccount(accNum);
        if (acc != null) {
            acc.withdraw(amount);
        } else {
            System.out.println("Account not found!");
        }
    }

    // View account details
    public void viewAccountDetails() {
        System.out.print("Enter Account Number: ");
        int accNum = sc.nextInt();

        Account acc = findAccount(accNum);
        if (acc != null) {
            acc.displayAccountDetails();
        } else {
            System.out.println("Account not found!");
        }
    }

    // Search for account by account number
    private Account findAccount(int accNum) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].accountNumber == accNum) {
                return accounts[i];
            }
        }
        return null;
    }

    // Main menu
    public void mainMenu() {
        int choice;
        do {
            System.out.println("\n===== Simple Banking System =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. View Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> createAccount();
                case 2 -> depositMoney();
                case 3 -> withdrawMoney();
                case 4 -> viewAccountDetails();
                case 5 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }

    // Main method
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        ui.mainMenu();
    }
}