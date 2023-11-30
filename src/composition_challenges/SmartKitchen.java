package composition_challenges;

public class SmartKitchen {

    private Refrigerator iceBox;
    private DishWasher dishWasher;
    private CoffeeMaker brewMaster;

    public SmartKitchen() {
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
        brewMaster = new CoffeeMaker();
    }

    public void setKitchenState(boolean workRefrigerator, boolean workDishWasher, boolean workCoffeMaker) {
        brewMaster.setHasWorkToDo(workCoffeMaker);
        iceBox.setHasWorkToDo(workRefrigerator);
        dishWasher.setHasWorkToDo(workDishWasher);
    }

    public void doKitchenWork() {
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }
}
