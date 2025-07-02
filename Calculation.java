 class Num {
        public double a;
        public double b;
        public double c;
        public double d;
    
        public void average(double a, double b, double c, double d) {//สร้างเมธอดสำหรับคำนวณค่าเฉลี่ย
        double[] numbers = {a, b, c, d};
        
        // คำนวณค่าเฉลี่ย
        System.out.println("The value of average is " + (numbers[0] + numbers[1] + numbers[2] + numbers[3]) / numbers.length);
    }
    
    public double toFarenheit(double celsius) {//สร้างเมธอดสำหรับแปลงค่าเซลเซียสเป็นฟาเรนไฮต์
        return (celsius * 9 / 5) + 32;//คำนวณแปลงค่าเซลเซียสเป็นฟาเรนไฮต์
    }
    
    public double toCelsius(double farenheit) {//สร้างเมธอดสำหรับแปลงค่าเซลเซียสเป็นฟาเรนไฮต์
        return (farenheit - 32) * 5 / 9;//คำนวณแปลงค่าเซลเซียสเป็นฟาเรนไฮต์
    }

    public int length(String firsString, String secondString) {//สร้างเมธอดสำหรับคำนวณความยาวของสตริง 2 สตริง
        return firsString.length() + secondString.length();//คำนวณความยาวของสตริง 2 สตริง
    }
}
public class Calculation {
    public static void main(String[] args) {
    Num cal = new Num();
    cal.average(20, 30, 40, 10);
    System.out.printf("Celsius to Fahrenheit: %.2f Farenheit\n",cal.toFarenheit(25));
    System.out.printf("Fahrenheit to Celsius: %.2f Celsius\n",cal.toCelsius(77));
    System.out.printf("Length of two strings: %d\n", cal.length("Hello", "World"));
}
}
