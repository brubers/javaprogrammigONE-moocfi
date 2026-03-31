
public class YourFirstAccount {

    public static void main(String[] args) {
        Account brunasAccount = new Account("Bruna's account", 100.00);

        brunasAccount.deposit(20.0);

        System.out.println(brunasAccount);

    }
}
