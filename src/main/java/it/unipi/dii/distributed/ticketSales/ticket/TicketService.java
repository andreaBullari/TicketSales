package it.unipi.dii.distributed.ticketSales.ticket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class TicketService {

    private final TicketRepository ticketRepository;
    @Autowired
    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public List<Ticket> getTickets(){
        return this.ticketRepository.findAll();
       // return List.of(new Ticket(1, "Andrea", 20, 10, "Milan-Inter", Date.from(Instant.now())));

    }
}
