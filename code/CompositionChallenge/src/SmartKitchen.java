public class SmartKitchen {

    private Refrigerator refrigerator;
    private DishWasher dishWasher;
    private CoffeeMaker coffeeMaker;

    public SmartKitchen() {
        refrigerator = new Refrigerator();
        dishWasher = new DishWasher();
        coffeeMaker = new CoffeeMaker();
    }

    public void setAppliancesState(boolean refrigeratorState, boolean dishWasherState, boolean coffeeMakerState) {
        refrigerator.setHasWorkToDo(refrigeratorState);
        dishWasher.setHasWorkToDo(dishWasherState);
        coffeeMaker.setHasWorkToDo(coffeeMakerState);
    }

    public void doKitchenWork() {
        refrigerator.orderFood();
        dishWasher.doDishes();
        coffeeMaker.brewCoffee();
    }

}

class Refrigerator {

    private boolean hasWorkToDo;

    public Refrigerator() {

    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Ordering food");
            hasWorkToDo = false;
        }
    }
}

class DishWasher {

    private boolean hasWorkToDo;

    public DishWasher() {

    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Washing dishes");
            hasWorkToDo = false;
        }
    }
}

class CoffeeMaker {

    private boolean hasWorkToDo;

    public CoffeeMaker() {

    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if (hasWorkToDo) {
           System.out.println("Brewing coffee");
           hasWorkToDo = false;
        }
    }
}