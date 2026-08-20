package com.wiccan.ticketapp.service;

import com.wiccan.ticketapp.model.Ticket;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import static java.lang.System.in;

@Service
public class TicketService {

    ArrayList<Ticket> ticketsList = new ArrayList<Ticket>();
    public void addTicket(Ticket newestTicket){
        ticketsList.add(newestTicket);
    }
    public ArrayList<String> returnTicketTitles(){
        ArrayList<String> ticketNames = new ArrayList<String>();
        for(Ticket ticket : ticketsList){
            ticketNames.add(ticket.getTitle());
        }
        return ticketNames;

    }
}

