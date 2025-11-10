package data.repositories;

import data.models.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VehiclesTest {
    private Vehicles vehicles;
    private Vehicle vehicle;

    @BeforeEach
    void setUp() {
        vehicles = new Vehicles();
        vehicle = new Vehicle();
    }

    @Test
    public void testSaveVehicle() {
        Vehicle vehicle1 = new Vehicle();
        vehicles.save(vehicle1);
        assertEquals(1, vehicles.count());
    }


    @Test
    public void testFindById() {
        Vehicle vehicle1 = new Vehicle();
        vehicles.save(vehicle1);
        Vehicle vehicle2 = new Vehicle();
        vehicles.save(vehicle2);
        Vehicle vehicle3 = new Vehicle();
        vehicles.save(vehicle3);
        assertEquals(vehicle3, vehicles.findById(3));

    }

    @Test
    public void testDeleteAllVehicles() {
        Vehicle vehicle1 = new Vehicle();
        vehicles.save(vehicle1);
        Vehicle vehicle2 = new Vehicle();
        vehicles.save(vehicle2);
        Vehicle vehicle3 = new Vehicle();
        vehicles.save(vehicle3);
        assertEquals(0, vehicles.deleteAll());

    }

    @Test
    public void testDeleteVehicle() {
        Vehicle vehicle1 = new Vehicle();
        vehicles.save(vehicle1);
        Vehicle vehicle2 = new Vehicle();
        vehicles.save(vehicle2);
        Vehicle vehicle3 = new Vehicle();
        vehicles.save(vehicle3);
        vehicles.delete(vehicle1);
        assertEquals(vehicle2, vehicles.findById(2));

    }

    @Test
    public void testFindAllVehicles() {
        Vehicle vehicle1 = new Vehicle();
        vehicles.save(vehicle1);
        Vehicle vehicle2 = new Vehicle();
        vehicles.save(vehicle2);
        Vehicle vehicle3 = new Vehicle();
        vehicles.save(vehicle3);
        List<Vehicle> vehicles1 = new ArrayList<>();
        vehicles1 = vehicles.findAll();
        assertEquals(vehicles.findAll(), vehicles1);
    }

    @Test
    public void testToUpdateVehicle() {
        Vehicle vehicle1 = new Vehicle();
        vehicles.save(vehicle1);
        Vehicle vehicle2 = new Vehicle();
        vehicles.save(vehicle2);
        vehicles.save(vehicle1);
        assertEquals(2, vehicles.count());


    }
}


