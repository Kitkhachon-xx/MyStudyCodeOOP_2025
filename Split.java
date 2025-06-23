import java.util.Scanner;
public class Split {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
            System.out.print("Enter Phone number: ");
                String n = input.nextLine();
                    String [] N = n.split("-");
                        for(String newn : N){
                            System.out.print(newn);
                        }
    }
    
}
