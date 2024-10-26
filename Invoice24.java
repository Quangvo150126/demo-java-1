public class Invoice24 {
    private int id;
    private Customer24 customer;
    private double amount;
    public Invoice24(int id, Customer24 customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }
    public int getId() {
        return id;
    }
    public Customer24 getCustomer() {
        return customer;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getCustomerId() {
        return customer.getId();
    }
    public String getCustomerName() {
        return customer.getName();
    }
    public int getCustomerDiscount(){
        return customer.getDiscount();
    }
    public double getAmoutAfterDiscount(){
        return customer.getDiscount();
    }
    public String toString() {
        return "ID: " + id + "\nCustomer: " + customer + "\nAmount: " + amount + "\n";
    }




}
