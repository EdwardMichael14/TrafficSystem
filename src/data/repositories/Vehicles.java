package data.repositories;

import data.models.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Vehicles implements VehicleRepositories {
    public List<Vehicle> vehicles = new ArrayList<>();
    public long count;


    @Override
    public Vehicle save(Vehicle vehicle) {
        vehicles.add(vehicle);
        count++;
        return vehicle;
    }

    @Override
    public void delete(Vehicle vehicle) {
        for (Vehicle vehicle1 : vehicles) {
            if (vehicle1 == vehicle) {
            vehicles.remove(vehicle);
            break;
        }
        }
        count--;
    }

    @Override
    public long count() {
        return count;
    }

    public Vehicle findById(int id) {
        for (Vehicle vehicle : vehicles) {
            if(vehicle.getId() == id) {
                return vehicle;

            }

        }
        return null;
    }

    @Override
    public List<Vehicle> findAll() {
        return vehicles;
    }

    @Override
    public void deleteById(int id) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle == vehicles.get(id)) {
                vehicles.remove(vehicle);
            }
        }

    }

    @Override
    public void deleteAll() {
        vehicles.clear();
    }
}
