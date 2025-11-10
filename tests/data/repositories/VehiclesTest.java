package data.repositories;

import data.models.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehiclesTest {
    private Vehicles vehicles;

    @BeforeEach
    void setUp() {
        vehicles = new Vehicles();
    }

    @Test
    public void testSaveVehicle() {
        Vehicle vehicle1 = new Vehicle();
        vehicles.save(vehicle1);
        assertEquals(1, vehicles.count());
    }

    @Test
    public void testDeleteVehicle() {
        Vehicle vehicle1 = new Vehicle();
        vehicles.save(vehicle1);
        vehicles.delete(vehicle1);
        assertEquals(0, vehicles.count());
    }


    @Test
    public void testFindById() {
        Vehicle vehicle1 = new Vehicle();
        vehicles.save(vehicle1);
        Vehicle vehicle2 = new Vehicle();
        vehicles.save(vehicle2);
        vehicles.findById(2);
        Vehicle result = vehicle2;
        assertEquals(vehicle2, result);

    }

    @Test
    public void testDeleteById() {
        Vehicle vehicle1 = new Vehicle();
        vehicles.save(vehicle1);
        Vehicle vehicle2 = new Vehicle();
        vehicles.save(vehicle2);
        vehicles.deleteById(2);
        Vehicle result = vehicle2;
        assertNull(result);
    }

}



