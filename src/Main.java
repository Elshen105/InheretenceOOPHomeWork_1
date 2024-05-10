public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Toyota", "Corolla", 50000);

        Car car = new Car("Toyota", "Lexus", 25000, 20);


        System.out.println(car.brand);
        System.out.println(car.model);
        System.out.println(car.mileage);


        car.addFuel(20);
        car.addFuel(30);
        car.addFuel(10);


    }

}
