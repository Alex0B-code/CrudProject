package com.wiccan.ticketapp.controller;

import com.wiccan.ticketapp.model.Ticket;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {
    @GetMapping("/ticket")
        public Ticket makeNewTicket(){
            return new Ticket("test", 01, "test ticket");

        }}
