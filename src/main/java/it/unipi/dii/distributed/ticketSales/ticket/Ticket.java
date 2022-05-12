package it.unipi.dii.distributed.ticketSales.ticket;

import javax.persistence.*;
import java.util.Date;
@Entity(name = "Student")
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
    @Column(
            name = "id",
            updatable = false
    )
    private long id;
    @Column(
            name = "email",
            nullable = false
    )
    private String email;
    @Column(
            name= "price",
            nullable = false

    )
    private double price;
    @Column(
            name= "position",
            nullable = false
    )
    private int position;
    @Column(
            name= "event",
            nullable = false
    )
    private String event;
    @Column(
            name= "eventDate",
            nullable = false
    )
    private Date eventDate;

    public Ticket(long id, String email, double price, int position, String event, Date eventDate) {
        this.id = id;
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

