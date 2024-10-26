import java.util.Arrays;

public class OPP22 {
        private String name;
        private OPP21[] authors;  // Array of Author objects
        private double price;
        private int qty = 0;  // default quantity is 0

        // Constructor
        public OPP22(String name, OPP21[] authors, double price) {
            this.name = name;
            this.authors = authors;
            this.price = price;
        }

        // Constructor with qty
        public OPP22(String name, OPP21[] authors, double price, int qty) {
            this.name = name;
            this.authors = authors;
            this.price = price;
            this.qty = qty;
        }

        public String getName() {
            return name;
        }

        public OPP21[] getAuthors() {
            return authors;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getQty() {
            return qty;
        }

        public void setQty(int qty) {
            this.qty = qty;
        }

        // Returns the authors as a string
        public String getAuthorNames() {
            StringBuilder authorNames = new StringBuilder();
            for (OPP21 author : authors) {
                authorNames.append(author.getName()).append(", ");
            }
            return authorNames.substring(0, authorNames.length() - 2); // Removing the trailing comma and space
        }

        @Override
        public String toString() {
            return "Book[name=" + name + ",authors=" + Arrays.toString(authors)
                    + ",price=" + price + ",qty=" + qty + "]";
        }
}
