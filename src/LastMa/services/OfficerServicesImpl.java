package LastMa.services;


import LastMa.data.models.Officer;
import LastMa.data.repositories.OfficerRepository;
import LastMa.dtos.requests.RegisterOfficerRequest;
import LastMa.dtos.responses.RegisterOfficerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static LastMa.utils.Mapper.map;


@Service
public class OfficerServicesImpl implements OfficerServices {
    @Autowired
    private OfficerRepository officers;

    @Override
    public RegisterOfficerResponse registerOfficer(RegisterOfficerRequest request) {
        Officer officer = map(request);

        if(officers.findByEmail(officer.getEmail()) != null)
            throw new IllegalArgumentException("Email already exists");
        Officer savedOfficer = officers.save(officer);
        RegisterOfficerResponse response = map(savedOfficer);
        return response;
    }

}
