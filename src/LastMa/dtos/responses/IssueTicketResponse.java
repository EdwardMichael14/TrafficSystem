package LastMa.dtos.responses;


import LastMa.data.models.Offence;
import LastMa.data.models.Officer;
import LastMa.data.models.Vehicle;
import lombok.Data;


@Data
public class IssueTicketResponse {
    private Vehicle vehicle;
    private String id;
    private Offence offence;
    private Officer issuer;
    private String dateOfBooking;
    private boolean hasPaid;
    private Officer paidOfficer;

}
