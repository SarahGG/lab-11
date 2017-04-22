import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Sarah Guarino on 4/21/2017.
 */
public class CarArrays {
    public static Scanner scnr = new Scanner(System.in);
    // Arrays holding new and used cars respectively
    public static ArrayList<Cars> newCars = new ArrayList<>();
    public static ArrayList<UsedCars> usedCars = new ArrayList<>();

    // default vehicles for testing
    public static void newCarsInSystem() {
        newCars.add(new Cars());
        newCars.get(0).setVIN("23ER23E");
        newCars.get(0).setMake("Ford");
        newCars.get(0).setModel("Fiesta");
        newCars.get(0).setYear(2014);
        newCars.get(0).setPrice(14000.00);

        newCars.add(new Cars());
        newCars.get(1).setVIN("78JK78J");
        newCars.get(1).setMake("Ford");
        newCars.get(1).setModel("Fusion");
        newCars.get(1).setYear(2007);
        newCars.get(1).setPrice(7500.00);

        newCars.add(new Cars());
        newCars.get(2).setVIN("56HJ56H");
        newCars.get(2).setMake("Ford");
        newCars.get(2).setModel("Fusion");
        newCars.get(2).setYear(2013);
        newCars.get(2).setPrice(13000.00);

        newCars.add(new Cars());
        newCars.get(3).setVIN("45GH45G");
        newCars.get(3).setMake("Chevy");
        newCars.get(3).setModel("Cruise");
        newCars.get(3).setYear(2005);
        newCars.get(3).setPrice(8000.00);
    }
    public static void usedCarsInSystem() {
        usedCars.add(new UsedCars());
        usedCars.get(0).setVIN("45GH45F");
        usedCars.get(0).setMake("Ford");
        usedCars.get(0).setModel("F150");
        usedCars.get(0).setYear(2011);
        usedCars.get(0).setPrice(9000.00);
        usedCars.get(0).setMileage(75000);

        usedCars.add(new UsedCars());
        usedCars.get(1).setVIN("34RD34R");
        usedCars.get(1).setMake("Chevy");
        usedCars.get(1).setModel("Impala");
        usedCars.get(1).setYear(2005);
        usedCars.get(1).setPrice(5000.00);
        usedCars.get(1).setMileage(312300);

        usedCars.add(new UsedCars());
        usedCars.get(2).setVIN("56VC56V");
        usedCars.get(2).setMake("Volkswagen");
        usedCars.get(2).setModel("Beetle");
        usedCars.get(2).setYear(2016);
        usedCars.get(2).setPrice(13600.00);
        usedCars.get(2).setMileage(15000);
    }
    // array interaction methods
    public static void removeCars(ArrayList<? extends Cars> myArray, String searchVIN) {
        for (int i = 0; i < myArray.size(); i++) {
            if (searchVIN.equals(myArray.get(i).getVIN())) {
                Menu.titleCarRemoved();
                System.out.println(myArray.get(i).toString());
                myArray.remove(i);
            }
        }
    }
    public static void editCars(ArrayList<? extends Cars> myArray, String searchVIN) {
        for (int i = 0; i < myArray.size(); i++) {
            if (searchVIN.equals(myArray.get(i).getVIN())) {
                Menu.titleCarEdited();
                System.out.println(myArray.get(i).toString());
                myArray.get(i).editCar();
            }
        }
        myArray.get(myArray.size() - 1).addCar();

        Menu.titleCarAdded();
        System.out.println(myArray.get(myArray.size() - 1).toString());
    }
    public static void addCars(ArrayList<? extends Cars> myArray) {
        myArray.get(myArray.size() - 1).addCar();

        Menu.titleCarAdded();
        System.out.println(myArray.get(myArray.size() - 1).toString());
    }
    public static void printCarByVIN(ArrayList<? extends Cars> myArray, String searchVIN) {
        for (Cars currentCar : myArray) {
            if (searchVIN.equals(currentCar.getVIN())) {
                Menu.titleMatchingCar();
                System.out.print(currentCar.toString());
            }
        }

    }
    public static void printCarByMake(ArrayList<? extends Cars> myArray, String searchMake) {
        for (Cars currentCar : myArray) {
            if (searchMake.equals(currentCar.getMake())) {
                System.out.print(currentCar.toString());
            }
        }
    }
    public static void printCarByModel(ArrayList<? extends Cars> myArray, String searchModel) {
        for (Cars currentCar : myArray) {
            if (searchModel.equals(currentCar.getModel())) {
                System.out.print(currentCar.toString());
            }
        }
    }
    public static void printCarByYear(ArrayList<? extends Cars> myArray, int searchYear) {
        for (Cars currentCar : myArray) {
            if (searchYear == currentCar.getYear()) {
                System.out.print(currentCar.toString());
            }
        }
    }
    public static void printCarByPrice(ArrayList<? extends Cars> myArray, double searchPrice) {
        for (Cars currentCar : myArray) {
            if (searchPrice > currentCar.getPrice()) {
                System.out.print(currentCar.toString());
            }
        }
    }
    public static void printAllNewCars() { // FIXME: this formatting needs help
        System.out.println("\t\tVIN\t\t\tMAKE\t\tMODEL\t\tYEAR\tPRICE");

        for (Cars newCar : newCars) {
            System.out.println(newCar.toString());
        }
    }
    public static void printAllUsedCars() { // FIXME: this formatting needs help
        System.out.println("\t\tVIN\t\t\tMAKE\t\tMODEL\t\tYEAR\tPRICE");

        for (UsedCars usedCar : usedCars) {
            System.out.println(usedCar.toString());
        }
        System.out.println();
    }
}
