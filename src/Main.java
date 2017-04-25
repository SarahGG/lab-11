import java.util.Scanner;
// FIXME: fix comments
// FIXME: edit car

/**
 * Manages the inventory or a car dealership
 *
 * @author Sarah Guarino
 * @version 1.0
 */
public class Main {
    private static Scanner scnr = new Scanner(System.in);

    /**
     * Navigates through the menu of the program
     *
     * @param args main method string args
     */
    public static void main(String[] args) {
        //user responses
        int userNum;
        double userDoub;
        String userString;

        // initializing cars that already exist
        CarInventory.newCarsInSystem();
        CarInventory.usedCarsInSystem();

        do {
            // 0. MENU MENU
            Menu.mainMenu();
            userNum = scnr.nextInt();
            scnr.nextLine();

            if (userNum == 1) {
                // 1. VIEW CARS
                Menu.menuViewCars();
                userNum = scnr.nextInt();
                scnr.nextLine();

                if (userNum == 1) {
                    // A. PRINT ALL CARS
                    Menu.titleNewCars();
                    CarInventory.printAllNewCars();
                    Menu.titleUsedCars();
                    CarInventory.printAllUsedCars();
                } else if (userNum == 2) {
                    // B. PRINT NEW CARS
                    Menu.titleNewCars();
                    CarInventory.printAllNewCars();
                } else if (userNum == 3) {
                    // C. PRINT USED CARS
                    Menu.titleUsedCars();
                    CarInventory.printAllUsedCars();
                } else if (userNum == 4) {
                    // D. PRINT SPECIFIC CARS BASED ON FEATURES
                    Menu.menuSearchCars();
                    userNum = scnr.nextInt();
                    scnr.nextLine();

                    if (userNum == 1) {
                        // I. SEARCH BY VIN
                        Menu.menuSearchVIN();
                        userString = scnr.nextLine();
                        CarInventory.printCarByVIN(CarInventory.newCars, userString);
                        // FIXME: return Car object
                        CarInventory.printCarByVIN(CarInventory.usedCars, userString);
                    } else if (userNum == 2) {
                        // II. SEARCH BY MAKE
                        Menu.menuSearchMake();
                        userString = scnr.nextLine();
                        Menu.titleNewCars();
                        CarInventory.printCarByMake(CarInventory.newCars, userString);
                        Menu.titleUsedCars();
                        CarInventory.printCarByMake(CarInventory.usedCars, userString);
                    } else if (userNum == 3) {
                        // III. SEARCH BY MODEL
                        Menu.menuSearchModel();
                        userString = scnr.nextLine();
                        Menu.titleNewCars();
                        CarInventory.printCarByModel(CarInventory.newCars, userString);
                        Menu.titleUsedCars();
                        CarInventory.printCarByModel(CarInventory.usedCars, userString);
                    } else if (userNum == 4) {
                        // IV. SEARCH BY YEAR
                        Menu.menuSearchYear();
                        userNum = scnr.nextInt();
                        scnr.nextLine();
                        Menu.titleNewCars();
                        CarInventory.printCarByYear(CarInventory.newCars, userNum);
                        Menu.titleUsedCars();
                        CarInventory.printCarByYear(CarInventory.usedCars, userNum);
                    } else if (userNum == 5) {
                        // V. MAX PRICE
                        Menu.menuSearchPrice();
                        userDoub = scnr.nextDouble();
                        scnr.nextLine();
                        Menu.titleNewCars();
                        CarInventory.printCarByPrice(CarInventory.newCars, userDoub);
                        Menu.titleUsedCars();
                        CarInventory.printCarByPrice(CarInventory.usedCars, userDoub);
                    }
                }
            } else if(userNum == 2) {
                // 2. ADD CAR
                Menu.menuAddCars();
                userNum = scnr.nextInt();
                scnr.nextLine();

                if (userNum == 1) {
                    // A. ADD NEW CAR
                    CarInventory.newCars.add(new Cars());
                    CarInventory.addCars(CarInventory.newCars);
                } else if (userNum == 2) {
                    // B. ADD USED CAR
                    CarInventory.newCars.add(new UsedCars());
                    CarInventory.addCars(CarInventory.newCars);
                }
            } else if (userNum == 3) {
                // 3. REMOVE A CAR
                Menu.menuRemoveCars();
                userString = scnr.nextLine();
                CarInventory.removeCars(CarInventory.newCars, userString);
                CarInventory.removeCars(CarInventory.usedCars, userString);
            } else if (userNum == 4) {
                // 4. EDIT A CAR
                Menu.menuEditCars();
                userNum = scnr.nextInt();
                scnr.nextLine();

                if(userNum == 1) {
                    // A. EDIT A NEW CAR
                    Menu.menuUpdateCar();
                    userString = scnr.nextLine();
                    CarInventory.editCars(CarInventory.newCars, userString);
                } else if (userNum == 2) {
                    // B. EDIT A USED CAR
                    Menu.menuUpdateCar();
                    userString = scnr.nextLine();
                    CarInventory.editCars(CarInventory.usedCars, userString);
                }
            } else if (userNum == 0) {
                break;
            }
            // Extra padding for main menu on rounds 2+
            System.out.println("");
        } while(true);

        System.out.println("Goodbye!");
    }
}
