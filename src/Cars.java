import java.util.Scanner;

/**
 * Holds all fields for a Cars object,
 * and it's associated getters and setters
 *
 * @author Sarah Guarino
 * @version 1.0
 */
public class Cars {
    public String VIN;
    public String make;
    public String model;
    public Integer year;
    public Double price;
    public Scanner scnr;

    public Cars() {
        scnr = new Scanner(System.in);
        this.VIN = "";
        this.make = "";
        this.model = "";
        this.year = 0;
        this.price = 0.0;
    }
    public String toString() {
        return "\t\t" + VIN + "\t\t" + make + "\t\t" + model + "\t\t" + year + "\t" + price;
    }
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
        System.out.print("Please enter the car's selling price: ");
        setPrice(scnr.nextDouble());
        scnr.nextLine();

        //extra line
        System.out.println();
    }
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
        System.out.print("Please enter the car's new selling price (currently: " + price + "):");
        setPrice(scnr.nextDouble());
        scnr.nextLine();

        //extra line
        System.out.println();
    }
    public String getVIN() {
        return VIN;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public Integer getYear() {
        return year;
    }
    public Double getPrice() {
        return price;
    }
    public void setVIN(String newVIN) {
        VIN = newVIN;
    }
    public void setMake(String newMake) {
        make = newMake;
    }
    public void setModel(String newModel) {
        model = newModel;
    }
    public void setYear(int newYear) {
        year = newYear;
    }
    public void setPrice(double newPrice) {
        price = newPrice;
    }
}
