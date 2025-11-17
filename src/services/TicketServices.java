package services;

import dtos.requests.IssueTicketRequest;
import dtos.responses.IssueTIcketResponse;

public interface TicketServices {

    IssueTIcketResponse issueTicket(IssueTicketRequest request);

}
