package LastMa.dtos.responses;


import lombok.Data;

@Data
public class SettleTicketResponse {
    private String ticketId;
    private double offenceFee;
    private String officerId;
    private String vehicleId;

    }
