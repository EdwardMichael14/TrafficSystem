package services;

import data.models.Officer;
import data.repositories.OfficerRepository;
import data.repositories.Officers;
import dtos.requests.RegisterOfficerRequest;
import dtos.responses.RegisterOfficerResponse;

import static utils.Mapper.map;

public class OfficerServicesImpl extends VehicleServiceImpl implements OfficerServices {
    private OfficerRepository officers = new Officers();

    @Override
    public RegisterOfficerResponse registerOfficer(RegisterOfficerRequest request) {
        Officer officer = map(request);

        if(officers.findByEmail(officer.getEmail()) != null)
            throw new IllegalArgumentException("Email already exists");
        officers.save(officer);
        return new RegisterOfficerResponse();
    }

}
