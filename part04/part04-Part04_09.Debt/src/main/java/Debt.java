public class Debt {
    private double balance;
    private double interestRate;

    public Debt(double initialBalance, double initalInterestRate){
        this.balance = initialBalance;
        this.interestRate = initalInterestRate;
    }

    public void printBalance(){
        System.out.println(this.balance);
    }

    public void waitOneYear(){
        this.balance = this.balance * this.interestRate;
    }


}
