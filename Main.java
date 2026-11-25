public class Main {

    public static void main(String[] args) {

        // Creating first bank account
        BankAccount account1 = new BankAccount(101, "Ravi", 5000);

        // Creating second bank account
        BankAccount account2 = new BankAccount(102, "Aman", 10000);

        // Operations on Account 1
        System.out.println("===== ACCOUNT 1 =====");
        account1.deposit(2000);
        account1.withdraw(1500);
        account1.checkBalance();

        // Operations on Account 2
        System.out.println("\n===== ACCOUNT 2 =====");
        account2.deposit(3000);
        account2.withdraw(2000);
        account2.checkBalance();

        // Display final details
        System.out.println("\n===== FINAL ACCOUNT DETAILS =====");
        account1.displayDetails();

        System.out.println();
        account2.displayDetails();
    }
}
