import java.util.Scanner;
public class Username {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
            System.out.print("Enter username1 : ");
                String US1 = input.nextLine();
            System.out.print("Enter username2 : ");
                String US2 = input.nextLine();
                if(US1.equals(US2)) /// ถ้า username1 กับ username2 มีค่าเท่ากัน   
{
                        System.out.println("Success!");
                    }else{
                        System.out.println("Failed! Please re-enter again!");
                    }

        }
}
