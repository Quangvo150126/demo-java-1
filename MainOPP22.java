public class MainOPP22 {
    public static void main(String[] args) {
        OPP21[] authors = new OPP21[2];
        authors[0] = new OPP21("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new OPP21("Paul Tan", "Paul@nowhere.com", 'm');

// Declare and allocate a Book instance
        OPP22 javaDummy = new OPP22("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);  // toString()

    }
}
