package services;

import dtos.requests.RegisterOfficerRequest;
import dtos.responses.RegisterOfficerResponse;

public interface OfficerServices {
    RegisterOfficerResponse registerOfficer(RegisterOfficerRequest request);

}
