package LastMa.controller;


import LastMa.dtos.requests.IssueTicketRequest;
import LastMa.dtos.requests.SettleTicketRequest;
import LastMa.dtos.requests.ViewTicketRequest;
import LastMa.dtos.responses.IssueTicketResponse;
import LastMa.dtos.responses.SettleTicketResponse;
import LastMa.dtos.responses.ViewTicketResponse;
import LastMa.services.TicketServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    TicketServicesImpl ticketServices;

    @PostMapping("/issueTicket")
    public IssueTicketResponse issueTicket(@RequestBody IssueTicketRequest request) {
        return ticketServices.issueTicket(request);
    }

    @PostMapping("/settleTicket")
    public SettleTicketResponse settleTicket(@RequestBody SettleTicketRequest request) {
        return ticketServices.settleTicket(request);
    }

    @GetMapping("/viewTicket/{ticketId}")
    public ViewTicketResponse viewTickets(@PathVariable ViewTicketRequest request) {
        return ticketServices.viewTickets(request);
    }


}
