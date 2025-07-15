package Car2;
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle Motorcycle = new motoCycle();
        car.startEngine();
        System.out.printf("Car has %d Wheels\n", car.getNumberOfWheels());
        car.stopEngine();

        Motorcycle.startEngine();
        System.out.printf("Motocycle has %d Wheels\n", Motorcycle.getNumberOfWheels());
        Motorcycle.stopEngine();
    }
}
