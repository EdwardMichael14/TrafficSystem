package LastMa.dtos.requests;


import LastMa.data.models.Owner;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Year;
@Data
@Document
public class RegisterVehicleRequest {
    private String vehicleName;
    private String model;
    private String color;
    private String ownerName;
    private String productionYear;
    private String ownerEmail;
    private String ownerNumber;
    private String ownerAddress;
    private String chasisNumber;

}
