package polymorphism_challenges;

public class MealDemo {
    public static void main(String[] args) {

        /*Item coke = new Item("drink", "coke", 1.50);
        coke.printItem();
        coke.setSize("LARGE");
        coke.printItem();

        Item avocado = new Item("topping", "avocado", 1.50);
        avocado.printItem();*/

       /* Burger burger = new Burger("regular", 4.00);
        burger.addToppings("bacon", "", "");
        burger.printItem();*/

       /* MealOrder regularMeal = new MealOrder();
        regularMeal.addBurgerToppings("bacon", "mayo", "cheese");
        regularMeal.setDrinkSize("LARGE");
        regularMeal.printItemizedList();*/

      /*  MealOrder secondMeal = new MealOrder("turkey", "7-up", "chili");
        secondMeal.addBurgerToppings("lettuce", "cheese", "mayo");
        secondMeal.setDrinkSize("SMALL");
        secondMeal.printItemizedList();*/

        MealOrder deluxeMeal = new MealOrder("deluxe", "7-up", "chili");
        deluxeMeal.addBurgerToppings("AVOCADO", "BACON", "LETTUCE", "CHEESE", "MAYO");
        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.printItemizedList();
    }
}
