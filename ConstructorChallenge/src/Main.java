public class Main {

    public static void main(String[] args) {

        // Instantiate object customer1
        Customer customer1 = new Customer();
        customer1.describeCustomer();

        // Instantiate object customer2
        Customer customer2 = new Customer("La Trong Nghia", "leonghiacnn@gmail.com");
        customer2.describeCustomer();

        // Instantiate object customer3
        Customer customer3 = new Customer("Pham Thi Van", 20000.0, "phamthivan1771973@gmail.com");
        customer3.describeCustomer();
    }
}
