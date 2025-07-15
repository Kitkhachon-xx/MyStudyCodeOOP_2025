package Shape;
public class Main {
    public static void main(String[] args) {
        shape circle = new Circle(5);
        shape rectangle = new rectangle(4,  7);

        System.out.println("Circle:");
        circle.printinfo();

        System.out.println("Rectangle:");
        rectangle.printinfo();
    }
}
