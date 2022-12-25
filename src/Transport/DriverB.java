package Transport;

public class DriverB < T extends Transport & Competing> extends Driver{
    public DriverB(String fullName, boolean typeOfLicence, int experience) {
        super(fullName, typeOfLicence, experience);
    }
    public DriverB() {
        super("",true,0);
    }

    public void drive(T transport) {
        System.out.println("The driver: " + getFullName() + " is driving the vehicle: " + transport.getBrand() +" " + transport.getModel() + " and will participate in the race");
    }
}
