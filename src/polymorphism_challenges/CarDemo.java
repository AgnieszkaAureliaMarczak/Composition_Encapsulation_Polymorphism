package polymorphism_challenges;

public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car("BMW");
        runRace(car);

        Car gasPoweredCar = new GasPoweredCar("Toyota", 25.50, 5);
        runRace(gasPoweredCar);

        Car electricCar = new ElectricCar("Honda", 55, 40_000);
        runRace(electricCar);

        HybridCar hybridCar = new HybridCar("Tesla", 15, 4, 2500);
        runRace(hybridCar);
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}
