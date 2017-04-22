/**
 * A class that handles all of the menu
 * titles and their associated formatting
 *
 * @author Sarah Guarino
 * @version 1.0
 */
public class Menu {
    /**
     * Main Menu
     */
    public static void mainMenu() {
        System.out.println("\nMAIN MENU - Please Enter 1, 2, 3, 4, or 0.");
        System.out.println("[1: View Cars*]" + "[2: Add a Car*]" + "[3: Remove a Car]" + "[4: Edit a Car]" + "[0: EXIT]");
    }
    public static void menuViewCars() {
        System.out.println("\nVIEW CARS - Please enter 1, 2, 3, or 4.");
        System.out.println("[1: See All Cars]" + "[2: See New Cars]" + "[3: See Used Cars]" + "[4: See a Specific Car]");
    }
    public static void menuSearchCars() {
        System.out.println("\nSEARCH CARS - Please enter 1, 2, 3, 4, or 5.");
        System.out.println("[1: VIN]" + "[2: Make]" + "[3: Model]" + "[4: Year]" + "[5: Maximum Price]");
    }
    public static void menuSearchVIN() {
        System.out.println("\nSEARCH BY VIN - Please enter the VIN of the car you would like to see: ");
    }
    public static void menuSearchMake(){
        System.out.println("\nSEARCH BY MAKE - Please enter the make of the car you would like to see: ");
    }
    public static void menuSearchModel(){
        System.out.println("\nSEARCH BY MODEL - Please enter the model of the car you would like to see: ");
    }
    public static void menuSearchYear(){
        System.out.println("\nSEARCH BY YEAR - Please enter the production year of the car you would like to see: ");
    }
    public static void menuSearchPrice(){
        System.out.println("\nSEARCH BY PRICE - Please enter the price of the car you would like to see: ");
    }
    public static void menuAddCars(){
        System.out.println("\nADD A CAR - Please enter 1 or 2.");
        System.out.println("[1: New Car]" + "[2: Used Car]");
    }
    public static void menuRemoveCars() {
        System.out.println("REMOVE A CAR - Please enter the VIN of the car you would like to remove.");
    }
    public static void menuEditCars() {
        System.out.println("\nEDIT A CAR - Please enter 1, or 2.");
        System.out.println("[1: Edit New Car]" + "[2: Edit Used Car]");
    }
    public static void menuUpdateCar() {
        System.out.println("EDIT CAR - Please enter the VIN of the car you would like to edit.");
    }

    // ACTION TITLES
    public static void titleNewCars() {
        System.out.println("\tNEW CARS:");
    }
    public static void titleUsedCars() {
        System.out.println("\tUSED CARS:");
    }
    public static void titleCarRemoved() {
        System.out.println("\tCAR REMOVED:");
    }
    public static void titleCarEdited() {
        System.out.println("\tCAR TO EDIT:");
    }
    public static void titleCarUpdated() {System.out.println("\tCAR UPDATED:");}
    public static void titleCarAdded() {
        System.out.println("\tCAR ADDED:");
    }
    public static void titleMatchingCar() {
        System.out.println("\tMATCH:");
    }
}
