package LastMa.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;
@Data
@Document("Officers")
public class Officer {
    private String name;
    @Id
    private String id;
    private String rank;
    private String email;


}