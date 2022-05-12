package creational.factory_method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class FactoryMethodTest {

    @Test
    void canUseCarPlantAsVehiclePlant() {
        VehiclePlant carPlant = new CarPlant();
        assertDoesNotThrow(carPlant::createVehicle);
    }

    @Test
    void canUseLocomotivePlantAsVehiclePlant() {
        VehiclePlant carPlant = new LocomotivePlant();
        assertDoesNotThrow(carPlant::createVehicle);
    }
}
