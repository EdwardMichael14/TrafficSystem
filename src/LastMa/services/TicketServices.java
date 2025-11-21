package LastMa.services;

import LastMa.dtos.requests.IssueTicketRequest;
import LastMa.dtos.requests.SettleTicketRequest;
import LastMa.dtos.requests.ViewTicketRequest;
import LastMa.dtos.responses.IssueTicketResponse;
import LastMa.dtos.responses.SettleTicketResponse;
import LastMa.dtos.responses.ViewTicketResponse;


public interface TicketServices {

    IssueTicketResponse issueTicket(IssueTicketRequest request);
    SettleTicketResponse settleTicket(SettleTicketRequest request);
    ViewTicketResponse viewTickets(ViewTicketRequest request);

}
