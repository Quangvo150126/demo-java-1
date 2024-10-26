public class MainOPP21 {
    public static void main(String[] args) {
        OPP21 ahTeck = new OPP21("Tan Ah Teck", "ahteck@nowhere.com", 'm'); // Test the constructor
        System.out.println(ahTeck);  // Test toString()
        ahTeck.setmail("paulTan@nowhere.com");  // Test setter
        System.out.println("name is: " + ahTeck.getName());     // Test getter
        System.out.println("email is: " + ahTeck.getMail());   // Test getter
        System.out.println("gender is: " + ahTeck.getGender()); // Test gette


    }

}
