package data.repositories;

import data.models.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Vehicles implements VehicleRepositories {
    private List<Vehicle> vehicles = new ArrayList<>();
    private int count;
    private int generateId ;


    @Override
    public Vehicle save(Vehicle vehicle) {

        if (vehicle.getId() == 0) {
            vehicle.setId(generateId());
            vehicles.add(vehicle);
            count++;
        }
        else{
        for (Vehicle vehicle2 : vehicles) {
            if (vehicle.getId() == vehicle2.getId()) {
                vehicle2 = vehicle;
                break;
            }
        }

        }

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
        throw new IllegalArgumentException("Vehicle with id " + id + " not found");
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
    public double deleteAll() {
        vehicles.clear();
        return 0;
    }

    public int generateId() {
        generateId++;
        return generateId;
    }

    @Override
    public String toString() {
        return  "vehicles =" + vehicles ;
    }

}
