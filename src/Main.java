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
        CarArrays.newCarsInSystem();
        CarArrays.usedCarsInSystem();

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
                    CarArrays.printAllNewCars();
                    Menu.titleUsedCars();
                    CarArrays.printAllUsedCars();
                } else if (userNum == 2) {
                    // B. PRINT NEW CARS
                    Menu.titleNewCars();
                    CarArrays.printAllNewCars();
                } else if (userNum == 3) {
                    // C. PRINT USED CARS
                    Menu.titleUsedCars();
                    CarArrays.printAllUsedCars();
                } else if (userNum == 4) {
                    // D. PRINT SPECIFIC CARS BASED ON FEATURES
                    Menu.menuSearchCars();
                    userNum = scnr.nextInt();
                    scnr.nextLine();

                    if (userNum == 1) {
                        // I. SEARCH BY VIN
                        Menu.menuSearchVIN();
                        userString = scnr.nextLine();
                        CarArrays.printCarByVIN(CarArrays.newCars, userString);
                        CarArrays.printCarByVIN(CarArrays.usedCars, userString);
                    } else if (userNum == 2) {
                        // II. SEARCH BY MAKE
                        Menu.menuSearchMake();
                        userString = scnr.nextLine();
                        Menu.titleNewCars();
                        CarArrays.printCarByMake(CarArrays.newCars, userString);
                        Menu.titleUsedCars();
                        CarArrays.printCarByMake(CarArrays.usedCars, userString);
                    } else if (userNum == 3) {
                        // III. SEARCH BY MODEL
                        Menu.menuSearchModel();
                        userString = scnr.nextLine();
                        Menu.titleNewCars();
                        CarArrays.printCarByModel(CarArrays.newCars, userString);
                        Menu.titleUsedCars();
                        CarArrays.printCarByModel(CarArrays.usedCars, userString);
                    } else if (userNum == 4) {
                        // IV. SEARCH BY YEAR
                        Menu.menuSearchYear();
                        userNum = scnr.nextInt();
                        scnr.nextLine();
                        Menu.titleNewCars();
                        CarArrays.printCarByYear(CarArrays.newCars, userNum);
                        Menu.titleUsedCars();
                        CarArrays.printCarByYear(CarArrays.usedCars, userNum);
                    } else if (userNum == 5) {
                        // V. MAX PRICE
                        Menu.menuSearchPrice();
                        userDoub = scnr.nextDouble();
                        scnr.nextLine();
                        Menu.titleNewCars();
                        CarArrays.printCarByPrice(CarArrays.newCars, userDoub);
                        Menu.titleUsedCars();
                        CarArrays.printCarByPrice(CarArrays.usedCars, userDoub);
                    }
                }
            } else if(userNum == 2) {
                // 2. ADD CAR
                Menu.menuAddCars();
                userNum = scnr.nextInt();
                scnr.nextLine();

                if (userNum == 1) {
                    // A. ADD NEW CAR
                    CarArrays.newCars.add(new Cars());
                    CarArrays.addCars(CarArrays.newCars);
                } else if (userNum == 2) {
                    // B. ADD USED CAR
                    CarArrays.newCars.add(new UsedCars());
                    CarArrays.addCars(CarArrays.newCars);
                }
            } else if (userNum == 3) {
                // 3. REMOVE A CAR
                Menu.menuRemoveCars();
                userString = scnr.nextLine();
                CarArrays.removeCars(CarArrays.newCars, userString);
                CarArrays.removeCars(CarArrays.usedCars, userString);
            } else if (userNum == 4) {
                // 4. EDIT A CAR
                Menu.menuEditCars();
                userNum = scnr.nextInt();
                scnr.nextLine();

                if(userNum == 1) {
                    // A. EDIT A NEW CAR
                    Menu.menuUpdateCar();
                    userString = scnr.nextLine();
                    CarArrays.editCars(CarArrays.newCars, userString);
                } else if (userNum == 2) {
                    // B. EDIT A USED CAR
                    Menu.menuUpdateCar();
                    userString = scnr.nextLine();
                    CarArrays.editCars(CarArrays.usedCars, userString);
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
