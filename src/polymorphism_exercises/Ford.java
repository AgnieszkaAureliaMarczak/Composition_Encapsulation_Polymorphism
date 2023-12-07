package polymorphism_exercises;

public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " " + getName() + " start engine!";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " " + getName() + " accelerate!";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " " + getName() + " brake!";
    }
}
