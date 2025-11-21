package LastMa.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Owner {
    public String ownerName;
    public String address;
    public String phone;
    public String gender;
    public String email;
    @Id
    public String id;
}
