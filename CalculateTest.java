class calculator{
public double calulateAverage(int [] arr){
        double sum = 0;
        double average = 0;
    for(int i = 0; i < arr.length; i++)
        sum+=arr [i];
        average = sum/arr.length;
return average;
}

public int add(int a, int b){
return a + b;
}

public int subtract(int a, int b){
return a - b;
}

public int multiply(int a, int b){
return a * b;
}

public double divide(int a, int b){

if( b == 0) 
    return -1;
else 
    return a / b;
}

}
public class CalculateTest {
    public static void main(String [] args){
    int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      calculator c = new calculator();  
    
    System.out.println(c.calulateAverage(arr));   
    System.out.println(c.add(2, 3));
    System.out.println(c.subtract(5, 8));
    System.out.println(c.multiply(8, 12));
    System.out.println(c.divide(8, 4));
    }
}
