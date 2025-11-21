package LastMa.dtos.requests;

import lombok.Data;


@Data
public class IssueTicketRequest {
    private String vehicleId;
    private String officerEmail;
    private String offence;


}


