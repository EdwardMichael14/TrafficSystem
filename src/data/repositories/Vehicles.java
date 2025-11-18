package data.repositories;

import data.models.Ticket;
import data.models.Vehicle;
import dtos.requests.RegisterVehicleRequest;

import java.util.ArrayList;
import java.util.List;

public class Vehicles implements VehicleRepositories {
    private static List<Vehicle> vehicles = new ArrayList<>();
    private static int count;
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
            count --;
    }

    @Override
    public void deleteAll() {
        vehicles.clear();
        count = 0;
    }

    public int generateId() {
        generateId++;
        return generateId;
    }

    public Vehicle findByChasisNumber(String chasisNumber) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getChasisNumber().equals(chasisNumber)) {
                return vehicle;
            }
        }
        return null;
    }

//    @Override
//    public String toString() {
//        return null;
//    }

}
