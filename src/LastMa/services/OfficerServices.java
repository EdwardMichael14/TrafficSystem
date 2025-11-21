package LastMa.services;


import LastMa.dtos.requests.RegisterOfficerRequest;
import LastMa.dtos.responses.RegisterOfficerResponse;

public interface OfficerServices {
    RegisterOfficerResponse registerOfficer(RegisterOfficerRequest request);

}
