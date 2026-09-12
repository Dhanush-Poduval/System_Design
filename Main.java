public class Main {
    
    public static void main(String[] args) {
        Notification notification=new Notification(null, null);
        BankAccount account = new BankAccount(101, "Ravi", 17, 200, "Savings",notification);
        // Age corrected to 18, balance corrected to 500 — printed by the constructor

        account.setPin(1234);

        account.deposit(1000);
        account.withdraw(500, 1234);
        account.withdraw(500, 9999); // wrong PIN, should fail

        account.printStatement();

        System.out.println("Interest earned: Rs. " + account.calculateInterest());
    }
}
