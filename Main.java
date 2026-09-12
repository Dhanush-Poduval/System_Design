public class Main {
    public static void main(String[] args) {
        // Instantiate services
        BankAccount account = new BankAccount(101, "Alice", 25, 1000.0, "Savings");
        Database db = new Database(account);
        Notification email= new Notification(account.getName());
        StatementGenerator statementGen = new StatementGenerator();

        // Create account
        

        // Deposit operation
        if (account.deposit(500.0)) {
            email.send_email("Your deposit of Rs. 500.0 was successful. New balance: " + account.getBalance());
            db.save_to_database();
        }

        // Withdraw operation
        if (account.withdraw(200.0, null)) {
            email.send_email("Your withdrawal of Rs. 200.0 was successful. New balance: " + account.getBalance());
            db.save_to_database();
        }

        // Generate and display statement
        String statement = statementGen.generate(account);
        System.out.print(statement);
    }
}