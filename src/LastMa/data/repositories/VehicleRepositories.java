package LastMa.data.repositories;


import LastMa.data.models.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface VehicleRepositories extends MongoRepository<Vehicle, String> {

    Optional<Vehicle> findByChasisNumber(String chasisNumber);

}
