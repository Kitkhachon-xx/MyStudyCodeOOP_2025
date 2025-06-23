import java.util.Scanner;
public class Ciper{
    public static String encrypt(String text, int shift){
        StringBuilder result = new StringBuilder();
        
        for(char character : text.toCharArray()){
            if(Character.isLetter(character)){
                char base = Character.isUpperCase(character)? 'A' : 'a';
                char shifted = (char)((character - base + shift)%26 + base);
               result.append(shifted);
                }
            else{
            result.append(character);
            }
        }
        return result.toString();
    }
                public static void main(String [] args){
                    Scanner input = new Scanner(System.in);
                    System.out.print("Enter Message: ");
                        String  message = input.nextLine();
                    System.out.print("Enter Shift: ");
                        int shift = input.nextInt();
                    String encrypted = encrypt(message, shift);
                    System.out.println("Encrypted: " + encrypted.toLowerCase());
                }
}
