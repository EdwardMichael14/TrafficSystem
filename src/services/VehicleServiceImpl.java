package services;

import data.models.Owner;
import data.models.Vehicle;
import data.repositories.VehicleRepositories;
import data.repositories.Vehicles;
import dtos.requests.RegisterVehicleRequest;
import dtos.responses.RegisterVehicleResponse;

import static utils.Mapper.map;

public class VehicleServiceImpl implements VehicleService{
    private VehicleRepositories vehicles = new Vehicles();

    @Override
    public RegisterVehicleResponse register(RegisterVehicleRequest request) {

        if(vehicles.findByChasisNumber(request.getChasisNumber()) != null)
            throw new IllegalArgumentException("Vehicle already exists");
        Vehicle vehicle = map(request);
        vehicles.save(vehicle);
        return new RegisterVehicleResponse();
    }


}
