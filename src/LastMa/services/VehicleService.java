package LastMa.services;


import LastMa.dtos.requests.RegisterVehicleRequest;
import LastMa.dtos.responses.RegisterVehicleResponse;

public interface VehicleService {
    RegisterVehicleResponse register(RegisterVehicleRequest request);



}
