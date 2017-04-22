import java.util.Scanner;

/**
 * Holds all fields for a UsedCars object,
 * and it's associated getters and setters
 *
 * @author Sarah Guarino
 * @version 1.0
 */
public class UsedCars extends Cars{
    private Scanner scnr = new Scanner(System.in);
    private Integer mileage;

    public UsedCars() {
        super();
        this.mileage = 0;
    }

    @Override
    public String toString() {
        return "\t\t" + VIN + "\t\t" + make + "\t\t" + model + "\t\t" + year + "\t" + mileage + "\t" + price;
    }
    @Override
    public void editCar() {
        System.out.print("Please enter the car's new VIN (currently: " + VIN + "): ");
        setVIN(scnr.nextLine());
        System.out.print("Please enter the car's new make (currently: " + make + "): ");
        setMake(scnr.nextLine());
        System.out.print("Please enter the car's new model (currently: " + model + "): ");
        setModel(scnr.nextLine());
        System.out.print("Please enter the car's new year (currently: " + year + "): ");
        setYear(scnr.nextInt());
        scnr.nextLine();
        System.out.print("Please enter the car's new mileage (currently: " + mileage + "): ");
        setMileage(scnr.nextInt());
        scnr.nextLine();
        System.out.print("Please enter the car's new selling price (currently: " + price + "):");
        setPrice(scnr.nextDouble());
        scnr.nextLine();

        //extra line
        System.out.println();
    }
    @Override
    public void addCar() {
        System.out.print("Please enter the car's VIN: ");
        setVIN(scnr.nextLine());
        System.out.print("Please enter the car's make: ");
        setMake(scnr.nextLine());
        System.out.print("Please enter the car's model: ");
        setModel(scnr.nextLine());
        System.out.print("Please enter the car's year: ");
        setYear(scnr.nextInt());
        scnr.nextLine();
        System.out.println("Please enter the car's current mileage: ");
        setMileage(scnr.nextInt());
        scnr.nextLine();
        System.out.print("Please enter the car's selling price: ");
        setPrice(scnr.nextDouble());
        scnr.nextLine();

        //extra line
        System.out.println();
    }
    public void setMileage(int newMileage) {
        mileage = newMileage;
    }
    public Integer getMileage() {
        return mileage;
    }
}
