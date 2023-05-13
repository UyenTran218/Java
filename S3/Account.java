import java.sql.Date;
import java.time.Year;

public class Account {
    String name;
    double balance;

    Account(String name, double balance){
        this.balance = balance;
        this.name = name;
    }
    
    public String toString(){
        return this.name + " " + this.balance ;
    }
    public double getBalance() {
        return balance;
    }
    public String getName() {
        return name;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
}
