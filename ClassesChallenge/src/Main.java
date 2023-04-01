public class Main {

    public static void main(String[] args) {

        // Instantiate a new object with passing arguments
//        Account account1 = new Account("0991000043560", 5_000_000.0, "La Trong Nghia", "leonghiacnn@gmail.com", "0399308301");

        // Instantiate a new object without passing arguments
        Account account1 = new Account();

        // Output the information of account1
        account1.describeAccount();

        // Depositing some money
        account1.depositingFunds(5_000_000.0);
        // Check the account balance after depositing
        System.out.println("Your current account balance is " + account1.getAccountBalance());

        // Withdrawing some money with valid amount
        account1.withdrawingFunds(2_000_000.0);
        // Check the account balance after withdrawing valid amount
        System.out.println("Your current account balance is " + account1.getAccountBalance());

        // Withdrawing some money with invalid amount
        account1.withdrawingFunds(20_000_000.0);
        // Check the account balance after withdrawing invalid amount
        System.out.println("Your current account balance is " + account1.getAccountBalance());

        // Instantiate another object named account2
        Account account2 = new Account("Pham Thi Van", "phamthivan1771973@gmail.com", "0986504232");
        account2.describeAccount();
    }
}
