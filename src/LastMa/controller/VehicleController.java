package LastMa.controller;


import LastMa.dtos.requests.RegisterVehicleRequest;
import LastMa.dtos.responses.RegisterVehicleResponse;
import LastMa.services.VehicleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {
    @Autowired
    VehicleServiceImpl vehicleService;

    @PostMapping("/vehicle")
    public RegisterVehicleResponse register(@RequestBody RegisterVehicleRequest request) {
        return vehicleService.register(request);
    }
}
