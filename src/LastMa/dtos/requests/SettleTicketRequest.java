package LastMa.dtos.requests;

import lombok.Data;

@Data
public class SettleTicketRequest {
    String ticketId;
    double offenceFee;
   String officerId;
    String vehicleId;
}
