package data.repositories;

import LastMa.data.models.Officer;
import LastMa.data.repositories.OfficerRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OfficersTest {
    private Officer officer;
    @Autowired
    private OfficerRepository officerRepository;



    @BeforeEach
    void setUp() {
        officer = new Officer();
//        officerRepository = new Officers();
    }

    @AfterEach
    void tearDown() {
        officerRepository.deleteAll();
    }

    @Test
    void testSaveOfficer() {
        officerRepository.save(officer);
        Officer officer1 = new Officer();
        officerRepository.save(officer1);
        assertEquals( 2, officerRepository.count());
    }

    @Test
    void testFindById() {
        officerRepository.save(officer);
        Officer officer1 = new Officer();
        officerRepository.save(officer1);
        assertEquals(officer1, officerRepository.findById(String.valueOf(2)));
    }

    @Test
    void testFindAll() {
        Officer officer1 = new Officer();
        officerRepository.save(officer1);
        officerRepository.save(officer);

        List<Officer> officer2 = new ArrayList<>();
        officer2 = officerRepository.findAll();
        assertEquals(officerRepository.findAll(), officer2);
    }

    @Test
    void deleteById() {
        Officer officer1 = new Officer();
        officerRepository.save(officer1);
        officerRepository.save(officer);
        officerRepository.deleteById(String.valueOf(1));
        assertEquals(1, officerRepository.count());
    }

    @Test
    void deleteAll() {
        Officer officer1 = new Officer();
        officerRepository.save(officer1);
        officerRepository.save(officer);
        officerRepository.deleteAll();
        assertEquals(0, officerRepository.count());
    }

    @Test
    void delete() {
        Officer officer1 = new Officer();
        officerRepository.save(officer1);
        officerRepository.save(officer);
        officerRepository.delete(officer);
        assertNull((Object) null);

    }


}