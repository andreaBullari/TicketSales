package it.unipi.dii.distributed.ticketSales.ticket;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Instant;
import java.util.Date;
import java.util.List;

@Configuration
public class TicketConfig {
    @Bean
    CommandLineRunner commandLineRunner(TicketRepository repository){
        return args -> {
            Ticket t = new Ticket("Andrea@live.it", 20, 10, "Milan-Inter", Date.from(Instant.now()));
            Ticket t2 = new Ticket("Giuseppe@live.it", 25, 11, "Milan-Inter", Date.from(Instant.now()));

            repository.saveAll(List.of(t, t2));

        };
    }
}
