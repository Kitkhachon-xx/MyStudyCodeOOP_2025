package InherVehicle;
class SportCar extends Car {
    private int maxSpeed;

        public SportCar(String brand, int year, int numDoors, int maxSpeed){
            super(brand, year, numDoors);
            this.maxSpeed = maxSpeed;
        }

        public void turboBoost(){
            System.out.println("Sport car turbo boost!!");
        }

}
