class BankAccount{
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance){
                
                this.accountNumber = accountNumber;
                this.accountHolderName = accountHolderName;
                this.balance = balance;
        }
    public void deposit(double amount){//ฝากเงินเพิ่มไปในบัญชี
        if (amount > 0) {
        balance = balance + amount;     
        }else{
          System.out.println("ไม่สามารถดำเนินการฝากเงินได้");
        }
        
    }

    public void withdraw(double amount){//ถอนเงินออกจากบัญชี
            if (amount > 0 && amount <= balance) {
                balance = balance - amount; 
            }else{
                throw new IllegalArgumentException("Insufficient funds or invalid withdraw amount");
            }
    }

    public void checkBalance(){
        System.out.println(balance);
    }

    public String getAccountNumber(){
        if (accountNumber.length() == 10) {
           return accountNumber; 
        }else{
            return "0";
        }
        
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }

    public double getBalance(){
        return balance;
    }

    public void setAccountHolderName(String accountHolderName){
                  this.accountHolderName = accountHolderName;   
    }
}

public class BankAccountTest {
    public static void main(String[] args) {
         try {
           BankAccount account = new BankAccount("0411200000", "Karina Bluu", 1000.0);
           account.checkBalance();
           account.deposit(500.0);
           account.checkBalance();
           account.withdraw(200.0);
           account.checkBalance();
           account.withdraw(2000.0);  // Should print an error message
           account.checkBalance();


           // Testing setter and getter
           account.setAccountHolderName("Yu Jimin");
           System.out.println("Account Holder Name: " + account.getAccountHolderName());
       } catch (IllegalArgumentException e) {
           System.out.println(e.getMessage());
       }


       try {
           BankAccount invalidAccount = new BankAccount("12345", "Invalid Account", 400.0);
       } catch (IllegalArgumentException e) {
           System.out.println(e.getMessage());
       

    }
    
}
}