public class Car extends Vehicle {
    public int fuelCapacity;
    public final int maxCapacity = 90;


    public Car(String brand, String model, int mileage, int fuelCapacity) {
        super(brand, model, mileage);
        this.fuelCapacity = fuelCapacity;
    }


    public void addFuel(int liters) {
        if (fuelCapacity + liters <= maxCapacity) {
            fuelCapacity += liters;
            System.out.println(liters + " liters of Fuel added" + "\nFuel litres : " + fuelCapacity);
        } else {
            int addedFuel = maxCapacity - fuelCapacity;
            fuelCapacity = maxCapacity;
            System.err.println("Maximum fuel Capacity : " + maxCapacity + "\nMaximum fuel that can be added: " + addedFuel);
        }
    }


}
