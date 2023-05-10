public class Account {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account() {
        this("56789", 2.50, "Default name", "Default email", "Default phone");
        System.out.println("Empty constructor called");
    }

    public Account(String accountNumber, double accountBalance, String customerName, String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Account(String customerName, String email, String phoneNumber) {
        this("99999", 100.55, customerName, email, phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void describeAccount() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account balance: " + accountBalance);
        System.out.println("Customer name: " + customerName);
        System.out.println("Email: " + email);
        System.out.println("Phone number: " + phoneNumber);
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositingFunds(double amount) {
        this.accountBalance += amount;
        System.out.println("You have successfully depositing " + amount + "VND");
    }

    public void withdrawingFunds(double amount) {
        if (this.accountBalance - amount > 0) {
            this.accountBalance -= amount;
            System.out.println("You have successfully withdrawing " + amount + "VND");
        } else {
            System.out.println("Your account balance must not below zero");
        }
    }
}
