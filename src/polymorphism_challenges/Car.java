package polymorphism_challenges;

public class Car {
    private String description;

    public Car() {

    }

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Car " + description + " started its engine.");
    }

    protected void runEngine() {
        System.out.println("Car " + description + " is running engine.");
    }

    public void drive() {
        runEngine();
        System.out.println("You can now drive it! The type is " + getClass().getSimpleName());
    }

    public String getDescription() {
        return description;
    }
}

class GasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("GasPoweredCar: all %d cylinders are fired up!%n", cylinders);
    }


    @Override
    protected void runEngine() {
        System.out.printf("GasPoweredCar: usage exceeds the average %.2f %n", avgKmPerLitre);
    }
}

class ElectricCar extends Car {
    private double avgKMPerCharge;
    private int batterySize;


    public ElectricCar(String description, double avgKMPerCharge, int batterySize) {
        super(description);
        this.avgKMPerCharge = avgKMPerCharge;
        this.batterySize = batterySize;
    }
}

class HybridCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;
    private int batterySize;


    public HybridCar(String description, double avgKmPerLitre, int cylinders, int batterySize) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("HybridCar with " + cylinders + " cylinders starts its engine.");
    }


    @Override
    protected void runEngine() {
        System.out.println("HybridCar " + getDescription() + " with " + cylinders +
                " cylinders is running its engine.");
    }
}
