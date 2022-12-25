package Transport;
public class DriverD < T extends Transport & Competing> extends Driver{
    public DriverD(String fullName, boolean typeOfLicence, int experience) {
        super(fullName, typeOfLicence, experience);
    }
    public DriverD() {
        super("",true,0);
    }

    public void drive(T transport) {
        System.out.println("The driver: " + getFullName() + " is driving the vehicle: " + transport.getBrand() +" " + transport.getModel() + " and will participate in the race");
    }
}