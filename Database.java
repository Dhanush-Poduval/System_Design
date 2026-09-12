public class Database {
    private int Account_number;
    public Database(BankAccount Account){
        this.Account_number=Account.getAccountNumber();
    }
    public void save_to_database(){
        System.out.println("[DB] Saving account " + Account_number + " to MySQL...");
    }
}
