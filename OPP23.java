public class OPP23 {
    private String Name;
    private String Email;
    private String isbn;
    private OPP23 author;
    private double price;
    private int qty;
    public OPP23(String Name, String Email) {
        this.Name = Name;
        this.Email = Email;

    }
    public OPP23(String isbn, String Name,String Email, OPP23 author, double price) {
        this.isbn = isbn;
        this.Name = Name;
        this.author = author;
        this.price = price;
    }
    public OPP23(String isbn, String Name, OPP23 author, double price, int qty) {
        this.isbn = isbn;
        this.Name = Name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    public String getisbn(){
    return isbn;
    }
    public String getName(){
        return Name;
    }
    public String getEmail(){
        return Email;
    }
    public void setEmail(String email){
        this.Email = email;

    }
    public OPP23 getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public String getAuthorName(){
        return author.getName();


    }
    public String toString(){
        return "OPP23[Name=" + Name + ",Authors=\" + Arrays.toString(Authors)\n" +
                "                    + \",Price=" + price + ",Qty=" + qty + ",Email=" + Email + ",isbn=" + isbn + "]";
    }



}
