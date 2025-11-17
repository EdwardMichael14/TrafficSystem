package services;

import data.models.Officer;
import data.repositories.OfficerRepository;
import data.repositories.Officers;
import dtos.requests.RegisterOfficerRequest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OfficerServicesImplTest {

    private OfficerServicesImpl officerServices;
    private OfficerRepository officer;

    @BeforeEach
    void setUp() {
        officerServices = new OfficerServicesImpl();
        officer = new Officers();
    }

    @AfterEach
    void tearDown() {
        officer.deleteAll();
    }

    @Test
    void registerOfficer() {
        RegisterOfficerRequest registerOfficerRequest = new RegisterOfficerRequest();
        officerServices.registerOfficer(registerOfficerRequest);
        assertEquals(1, officer.count());

    }

    @Test
    void getOfficers() {
        RegisterOfficerRequest registerOfficerRequest = new RegisterOfficerRequest();
        registerOfficerRequest.setEmail("chibuzor@gmail.com");
        officerServices.registerOfficer(registerOfficerRequest);
        assertEquals(1, officer.count());

        assertThrows(IllegalArgumentException.class, () -> officerServices.registerOfficer(registerOfficerRequest) );
        assertEquals(1, officer.count());
    }
}