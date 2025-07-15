package InherVehicle;
class ElectricCar extends Car {
    private int batteryCapacity;
            
            public ElectricCar(String brand, int year, int numDoors, int batteryCapacity){
                super(brand, year, numDoors);
                this.batteryCapacity = batteryCapacity;
            };
            public void charge(){
                System.out.println("Electriv car is chaging");
            }

}
