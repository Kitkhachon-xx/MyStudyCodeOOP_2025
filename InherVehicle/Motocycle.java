package InherVehicle;
class Motocycle extends Vehicle{
    private boolean hassidecar;
                  
            public Motocycle(String brand, int year, boolean hassidecar){
                super(brand, year);
                this.hassidecar = hassidecar;
            }

            public void revEngine(){
                System.out.println("Motocycle engine revs!!!!!!");
            }

}
