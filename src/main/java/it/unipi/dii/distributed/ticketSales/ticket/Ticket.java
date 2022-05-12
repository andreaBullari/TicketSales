package it.unipi.dii.distributed.ticketSales.ticket;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table
public class Ticket {

    @Id
    @SequenceGenerator(
            name = "ticket_sequence",
            sequenceName = "ticket_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "ticket_sequence"
    )

    private long id;
    private String email;
    private double price;
    private int position;
    private String event;
    private Date eventDate;

    public Ticket(){}
    public Ticket( String email, double price, int position, String event, Date eventDate) {
        this.email = email;
        this.price = price;
        this.position = position;
        this.event = event;
        this.eventDate = eventDate;
    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public double getPrice() {
        return price;
    }

    public int getPosition() {
        return position;
    }

    public String getEvent() {
        return event;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", price=" + price +
                ", position=" + position +
                ", event='" + event + '\'' +
                ", eventDate=" + eventDate +
                '}';
    }

    public void setId(long id){
        this.id = id;
    }
}

