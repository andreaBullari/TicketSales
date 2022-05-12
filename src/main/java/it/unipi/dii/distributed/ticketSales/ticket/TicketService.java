package it.unipi.dii.distributed.ticketSales.ticket;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.Instant;
import java.util.List;
@Service
public class TicketService {

    public List<Ticket> getTickets(){

        return List.of(new Ticket(1, "Andrea", 20, 10, "Milan-Inter", Date.from(Instant.now())));

    }
}
