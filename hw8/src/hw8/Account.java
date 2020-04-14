package hw8;

public abstract class Account {

    int accountId;
    
    public Account() {
    	
    }

    public Account(int id){
        this.accountId=id;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    
    public abstract double calculateSales();

    @Override
    public String toString() {
        return "Account ID: "+getAccountId();
    }
}