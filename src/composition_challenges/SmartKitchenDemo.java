package composition_challenges;

public class SmartKitchenDemo {
    public static void main(String[] args) {

        SmartKitchen smartKitchen = new SmartKitchen();

       /* smartKitchen.getIceBox().setHasWorkToDo(true);
        smartKitchen.getBrewMaster().setHasWorkToDo(true);
        smartKitchen.getDishWasher().setHasWorkToDo(true);

        smartKitchen.getBrewMaster().brewCoffee();
        smartKitchen.getDishWasher().doDishes();
        smartKitchen.getIceBox().orderFood();*/

        smartKitchen.setKitchenState(true, true, true);
        smartKitchen.doKitchenWork();
    }
}
