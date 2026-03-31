public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance){
        this.balance = openingBalance;
    }

    public String toString(){
        return "The card has a balance of " + this.balance + " euros";
    }
    
    public void eatAffordably(){

        double result = this.balance -  2.60;

        if (result >= 0) {
            this.balance = result;
        }
        
    }
    
    public void eatHeartily(){

        double result = this.balance - 4.60;

        if (result >= 0) {
            this.balance = result;
        }
        
    }

    public void addMoney(double amount){
        if (amount <= 0){
            return;
        }

        this.balance += amount;
        if (this.balance > 150) {
            this.balance = 150;
            return;
        }
    }


}