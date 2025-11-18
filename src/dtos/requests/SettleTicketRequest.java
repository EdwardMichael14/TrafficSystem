package dtos.requests;

public class SettleTicketRequest {
    int ticketId;
    double offenceFee;
    int officerId;
    int vehicleId;

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public double getOffenceFee() {
        return offenceFee;
    }

    public void setOffenceFee(double offenceFee) {
        this.offenceFee = offenceFee;
    }

    public int getOfficerId() {
        return officerId;
    }

    public void setOfficerId(int officerId) {
        this.officerId = officerId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }
}
