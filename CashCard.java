package sg.edu.nus.iss;

public class CashCard {
    
    //create variables id & balance
    private String id = "";
    private double balance;

    //create 2 constructors, 1 default & 1 with id & balance parameters
    public CashCard() {
    }

    public CashCard(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    //create a topup method
    //tops up a given amount to the cashcard
    //no value is returned
    public void topUp(double topUpAmt){
        balance = topUpAmt + balance;
    }

    //create a deduct method
    //deducts a given amount from the cashcard if balance is sufficient
    //returns true if deduction is successful
    //returns false if deduction is unsuccessful
    public boolean deduct(double deductAmt){;
        if (deductAmt < balance){
            balance = balance - deductAmt;
            return true;
        } else {
            return false;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "CashCard [id=" + id + ", balance=" + balance + "]";
    }


    
}
