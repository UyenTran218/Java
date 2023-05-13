import java.util.*;
import Java.S3.Account;

public class Bank {
    final static Account ACCOUNT_1 = new Account("Smart Access", 550.09);
    final static Account ACCOUNT_2 = new Account("Saving", 678.23);
    final static Account ACCOUNT_3 = new Account("Saving-2", 50000.49);

    private List<Account> _accountList = new ArrayList<Account>();

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addAccount(ACCOUNT_1);
        bank.addAccount(ACCOUNT_2);
        bank.addAccount(ACCOUNT_3);

        bank.deposit(100, ACCOUNT_1);
        bank.withdraw(200, ACCOUNT_2);

        List<Account> accounts = bank.getAccounts();
        for(int i = 0; i < accounts.size(); i++){
            System.out.println(accounts.get(i).toString());
        }
        
        
    }
    public void addAccount(Account a){
        this._accountList.add(a);
    }
    public void removeAccount(Account a){
        this._accountList.remove(a);
    }
    public List<Account> getAccounts(){
        return this._accountList;
    }
    public void deposit(double amount, Account a){
        for(int i = 0; i < _accountList.size(); i++){
            Account theAccount = _accountList.get(i);
            if(theAccount.getName() == a.getName()){
                theAccount.setBalance(theAccount.getBalance() + amount);
            }
        }
    }
    public void withdraw(double amount, Account a){
        for(int i = 0; i < _accountList.size(); i++){
            Account theAccount = _accountList.get(i);
            if(theAccount.getName() == a.getName()){
                theAccount.setBalance(theAccount.getBalance() - amount);
            }
        }
    }
}
