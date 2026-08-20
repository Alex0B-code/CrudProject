package com.wiccan.ticketapp.controller;

import com.wiccan.ticketapp.model.Ticket;
import com.wiccan.ticketapp.service.TicketService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping("/createTicket")
        public void createNewTicket(@RequestBody Ticket newTicket) {
         ticketService.addTicket(newTicket);
    }
    @GetMapping("/GetTickets")
        public ArrayList<String> GetTicketList(){
        return ticketService.returnTicketTitles();
    }


}
