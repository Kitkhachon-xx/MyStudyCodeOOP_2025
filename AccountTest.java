import javax.swing.JOptionPane;
class Account{
    private double balance;
    //private String ans;
        public Account(double initialBalance){ //Contructor
            if(initialBalance > 0.0) balance = initialBalance;
        }
        public void deposit(double amount){
        balance = balance + amount; //Add money to Account
        }
        public void withdraw(double amount){// ถอนเงินออกจากบัญชี
            // Control Logic
        if(balance >= amount){  //สร้างเงื่อนไขการถอนเงิน
        balance = balance - amount;
        }else{
        JOptionPane.showMessageDialog(null, "You have No Money enough!!!!", "alert", JOptionPane.ERROR_MESSAGE); //แสดงป้ายประการแจ้งเตือน
        }
        }
        public double getBalance(){ //ดูยอดเงินในบัญชี
        return balance;
            
        }
    @Override
        public String toString(){
            return "Money in your account" + balance;
        }
}
public class AccountTest {
        public static void main(String [] args){
            Account me = new Account(100);//เงิน400
            me.deposit(300);
            System.out.println(me.getBalance());
            me.withdraw(500); //เกินวงเงิน
            System.out.println(me.getBalance());
            System.out.println(me);
        }
}
