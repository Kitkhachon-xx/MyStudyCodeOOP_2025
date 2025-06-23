import java.util.Scanner;
public class StringFormat {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
            System.out.print("Enter Name : ");
                String a = input.nextLine();
                       a = a.trim().toLowerCase();
                      String [] N = a.split(" ");
                        for(int i = 0; i < N.length; i++){
                            if(N[i].length() > 0 ){
                               N[i] = N[i].substring(0, 1).toUpperCase() + N[i].substring(1);
                                       }
                                    }
                        String result = String.join(" ", N);
                        System.out.println(result);     
        }
    }

