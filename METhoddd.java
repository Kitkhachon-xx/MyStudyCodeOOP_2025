public class METhoddd {
    public static void clab(){
        System.out.println("1");
        System.out.println("2");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("1");
        System.out.println("2");
        System.out.println("1");
        System.out.println("2");
        System.out.println("1");
    }
    public static void printN(){
        System.out.println("Print: n");
    }
    public static void printN(int n){
        System.out.println("Print: " + n );
    }
    public static void printN(int n, int m){
        System.out.println("Print: " + (n + m));
    }
    public static void printN(String n, String m){
        if(n.endsWith("555") && m.endsWith("666"))
        
        System.out.println("Print: " + n + m);
    }
    public static int sum(int x, int y){
        int sum = 0;
        for(int i = x; i <= y ; i++){
        sum +=i;
        }
        System.out.print("Sum from " + x + " to " + y + " is " );
        
        
    
        return sum;
    }
    public static int max(int num1 , int num2){
    
        int result;
        
        if(num1 > num2){
            result = num1;
    }
        else{
            result = num2;
            }
        
        return result;
        
    }
    public static int min(int num1 , int num2){
    
        int result;
        
        if(num1 < num2){
            result = num1;
    }
        else{
            result = num2;
            }
        
        return result;
        
    }
    public static void main(String [] args){
        printN();
        printN(999);
        printN(555,666);
        printN("25", "6666");
        System.out.println(max(555, 666));
        System.out.println(min(555, 666));
        System.out.println(sum( 1, 10 ));
    }
}
