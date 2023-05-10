public class Main {

    public static void main(String[] args) {


        // Instantiate a smartKitchen object
        SmartKitchen smartKitchen = new SmartKitchen();

        // Set the state of appliances in smart kitchen
        smartKitchen.setAppliancesState(false, true, true);

        // Start the smart kitchen
        smartKitchen.doKitchenWork();
    }
}
