package services;

import dtos.requests.IssueTicketRequest;
import dtos.requests.SettleTicketRequest;
import dtos.responses.IssueTicketResponse;
import dtos.responses.SettleTicketResponse;

public interface TicketServices {

    IssueTicketResponse issueTicket(IssueTicketRequest request);
    SettleTicketResponse settleTicket(SettleTicketRequest request);

}
