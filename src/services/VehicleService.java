package services;

import dtos.requests.RegisterVehicleRequest;
import dtos.responses.RegisterVehicleResponse;

public interface VehicleService {
    RegisterVehicleResponse register(RegisterVehicleRequest request);



}
