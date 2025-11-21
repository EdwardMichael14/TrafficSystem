package LastMa.data.models;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Data
@Document
public class Ticket {
    private Vehicle vehicle;
    @Id
    private String id;
    private Offence offence;
    private Officer issuer;
    private LocalDateTime dateOfBooking = LocalDateTime.now();
    private LocalDateTime dateOfPayment = LocalDateTime.now();
    private boolean hasPaid;
    private Officer paidOfficer;
}
