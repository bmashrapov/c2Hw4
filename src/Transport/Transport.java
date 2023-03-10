package Transport;

public class Transport {
    private String brand;
    private String model;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void startMoving() {
        System.out.println(brand + " " + model + " начинает движение");
    }

    public void finishTheMove() {
        System.out.println(brand + " " + model + " заканчивает движение");
    }
}
