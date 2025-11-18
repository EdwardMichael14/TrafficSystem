package services;

import dtos.requests.RegisterVehicleRequest;
import dtos.requests.SettleTicketRequest;
import dtos.responses.RegisterVehicleResponse;
import dtos.responses.SettleTicketResponse;

public interface VehicleService {
    RegisterVehicleResponse register(RegisterVehicleRequest request);
    SettleTicketResponse settleTicket(SettleTicketRequest request);


}
