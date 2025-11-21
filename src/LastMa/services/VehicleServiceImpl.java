package LastMa.services;


import LastMa.data.models.Vehicle;
import LastMa.data.repositories.VehicleRepositories;
import LastMa.dtos.requests.RegisterVehicleRequest;
import LastMa.dtos.responses.RegisterVehicleResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static LastMa.utils.Mapper.map;

@Service
public class VehicleServiceImpl implements VehicleService {
    @Autowired
    private VehicleRepositories vehicles;



    @Override
    public RegisterVehicleResponse register(RegisterVehicleRequest request) {

        if(vehicles.findByChasisNumber(request.getChasisNumber()).isPresent())
            throw new IllegalArgumentException("Vehicle already exists");
        Vehicle vehicle = map(request);
        Vehicle savedVehicle =  vehicles.save(vehicle);
        RegisterVehicleResponse response = map(savedVehicle);
        return response;
    }



    }





