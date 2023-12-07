package polymorphism_exercises;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " with " + getCylinders() + " cylinders, start engine!";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " with " + getCylinders() + " cylinders, accelerate!";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " with " + getCylinders() + " cylinders, brake!";
    }
}
