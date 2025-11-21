package LastMa.dtos.requests;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class RegisterOfficerRequest {
    private String name;
    private String email;

}
