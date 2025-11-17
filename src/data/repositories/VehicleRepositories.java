package data.repositories;

import data.models.Vehicle;

import java.util.List;

public interface VehicleRepositories {
    Vehicle save(Vehicle vehicle);
    Vehicle findById(int id);
    List<Vehicle> findAll();
    void deleteById(int id);
    void deleteAll();
    void delete(Vehicle vehicle);
    long count();
    Vehicle findByChasisNumber(String chasisNumber);

}
