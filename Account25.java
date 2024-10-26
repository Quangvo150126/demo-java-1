public class Account25 {
    private int id;
    private Customer25 customer;
    private double balance = 0.0;
    public Account25(int id, Customer25 customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    public Account25(int id, Customer25 customer) {
        this.id = id;
        this.customer = customer;

    }
    public int getId() {

        return id;
    }
    public Customer25 getCustomer() {

        return customer;
    }
    public double getBalance() {

        return balance;
    }
    public void setBalance(double balance) {

        this.balance = balance;
    }
    public String getCustomerName() {
        return getCustomerName();

    }
    public void deposit(double amount) {
        if(amount >0){
            balance += amount;
            System.out.printf("Deposited: $%.2f.New Balance: $%2f%n", amount, balance);
            }else {
            System.out.println("Deposit amount must be positive.");
        }
        }
        public void withdraw(double amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.printf("Withdrew: $%.2f.New Balance: $%2f%n", amount, balance);
        }else {
            System.out.println("Withdrew amount must be positive.");

          }
        }
        public String toString() {
        return "Account #" + id + ": Customer: " + customer.toString() + " Balance: " + balance;

        }




}
