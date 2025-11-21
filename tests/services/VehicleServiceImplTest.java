package services;

import data.repositories.VehicleRepositories;
import dtos.requests.RegisterVehicleRequest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleServiceImplTest {

    VehicleServiceImpl vehicleServices;
    VehicleRepositories vehicles;

    @BeforeEach
    void setUp() {
        vehicleServices = new VehicleServiceImpl();
        vehicles = new Vehicles();
    }

    @AfterEach
    void tearDown() {
        vehicles.deleteAll();
    }

    @Test
    void registerVehicle() {
        RegisterVehicleRequest request = new RegisterVehicleRequest();
        vehicleServices.register(request);
        assertEquals(1, vehicles.count());

    }


    @Test
    void checkThatOneVehicleIsNotSavedTwice() {
        RegisterVehicleRequest request = new RegisterVehicleRequest();
        request.setChasisNumber("Mike14");
        vehicleServices.register(request);
        assertEquals(1, vehicles.count());

        assertThrows(IllegalArgumentException.class, () -> vehicleServices.register(request));
        assertEquals(1, vehicles.count());
    }

}