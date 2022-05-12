package creational.factory_method;

public class LocomotivePlant implements VehiclePlant {
    public Vehicle createVehicle() {
        return new Locomotive();
    }
}
