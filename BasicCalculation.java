import java.util.Scanner;
public class BasicCalculation {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
            System.out.print("n: ");
                double n = input.nextDouble();
            
            System.out.print("Enter Operator: ");
                char OP = input.next().charAt(0);
            
            System.out.print("m: ");
                int m = input.nextInt();
                
            
                    switch (OP){
                        case '+' :
                               System.out.println(n + m);
                               break;
                        case '-' :
                               System.out.println(n - m);
                               break;
                        case '*' : 
                                System.out.println(n * m);
                                break;
                        case '/' :    
                                System.out.println(n/m);
                                break;
                        case '^' :
                                System.out.println(Math.pow(n, m));
                                break;
                    }
    }
}
