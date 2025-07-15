package InherVehicle;
public class TestVehicle {
    public static void main(String[] args) {
        Motocycle moto = new Motocycle("Harley", 2022, true);
        Car misu = new Car("Mitsu", 2020, 4);
        ElectricCar tesla = new ElectricCar("Tesla", 2025, 4, 100);
        SportCar ferrari = new SportCar("Ferrari", 2023, 2, 350);
        misu.move();
        misu.honk();
        tesla.charge();
        misu.honk();
        ferrari.turboBoost();
        ferrari.move();
        moto.revEngine();
    }
}
