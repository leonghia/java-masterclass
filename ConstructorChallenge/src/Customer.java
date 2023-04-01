public class Customer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void describeCustomer() {
        System.out.println("Customer name: " + name);
        System.out.println("Credit limit: " + creditLimit);
        System.out.println("Email address: " + emailAddress);
    }

    public Customer() {
        this("Default name","Default email");
        System.out.println("Empty constructor called");
    }

    public Customer(String name, String emailAddress) {
        this(name, 5000.0, emailAddress);
        System.out.println("Constructor with only 2 parameters called");
    }

    public Customer(String name, double creditLimit, String emailAddress) {
        System.out.println("Constructor with all parameters called");
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }


}
