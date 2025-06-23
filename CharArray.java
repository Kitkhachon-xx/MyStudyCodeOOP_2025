import java.util.Scanner;
public class  CharArray {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);    
            System.out.print("Please input text: ");
            String text = input.nextLine();
            char [] t = text.toCharArray();
            for(char tt : t){
                if(!Character.isWhitespace(tt))
                System.out.println(tt);
    }
}
}