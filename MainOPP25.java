public class MainOPP25 {
    public static void main(String[] args) {
        Customer25 c1 = new Customer25(18,"Vo Thanh Quang",'Q');
        System.out.println(c1);
        System.out.println("id is: "+c1.getId());
        System.out.println("name is: "+c1.getName());
        System.out.println("gender is: "+c1.getGender());


        Account25 a1 = new Account25(46,c1,555.5);
        System.out.println(a1);

        a1.setBalance(999999.9);
        System.out.println(a1);
        System.out.println("id is: "+a1.getId());
        System.out.println("customer is: "+a1.getCustomer());
        System.out.println("balance is: "+a1.getBalance());
        System.out.println("customer's id is: "+a1.getCustomer().getId());
        System.out.println("customer's name is: "+a1.getCustomer().getName());
        System.out.println("customer's gender is: "+a1.getCustomer().getGender());
        a1.deposit(200.0);
        a1.withdraw(999.9);
        a1.withdraw(234.0);

    }
}
