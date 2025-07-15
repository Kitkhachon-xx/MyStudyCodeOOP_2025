package Shape;
public abstract class shape {
    abstract double getArea();
    abstract double getPerimeter();
    void printinfo() {
        System.out.printf(" Area: %.5f\n Perimeter: %.5f\n", getArea(), getPerimeter());
    }
}
