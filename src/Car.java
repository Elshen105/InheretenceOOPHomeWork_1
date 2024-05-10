public class Car extends Vehicle {
    public int currentBenzineLitres;
    public final int fuelCapacity = 90;


    public Car(String brand, String model, int mileage, int currentBenzineLitres) {
        super(brand, model, mileage);
        this.currentBenzineLitres = currentBenzineLitres;
    }


    public void addFuel(int liters) {
        if (currentBenzineLitres + liters <= fuelCapacity) {
            currentBenzineLitres += liters;
            System.out.println(liters + " liters of Fuel added" + "\nFuel litres : " + currentBenzineLitres);
        } else {
            int addedFuel = fuelCapacity - currentBenzineLitres;
            currentBenzineLitres = fuelCapacity;
            System.err.println("Maximum fuel Capacity : " + fuelCapacity + "\nMaximum fuel that can be added: " + addedFuel);
        }
    }


}
