package LastMa.controller;


import LastMa.dtos.requests.RegisterOfficerRequest;
import LastMa.dtos.responses.RegisterOfficerResponse;
import LastMa.services.OfficerServices;
import LastMa.services.OfficerServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OfficerController {
    @Autowired
    OfficerServices officerServices;

    @PostMapping("/officer")
    public RegisterOfficerResponse registerOfficer(@RequestBody RegisterOfficerRequest request) {
        return officerServices.registerOfficer(request);
    }
}
