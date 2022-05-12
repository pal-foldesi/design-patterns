package creational.factory_method;

public class CarPlant implements VehiclePlant {
    public Vehicle createVehicle() {
        return new Car();
    }
}
