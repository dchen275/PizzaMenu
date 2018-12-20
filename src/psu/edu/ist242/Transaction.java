package psu.edu.ist242;

//Probably should handle credit/debit info
//Handles Payment types ATM
public class Transaction {
    private String transaction;

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }
    public String getTransaction() {
        return transaction;
    }

    public Transaction (String transaction){
        this.transaction = transaction;
    }
}
