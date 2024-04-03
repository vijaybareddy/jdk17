package moviebooking;

public class BookService {
    public TicketBookConfirm bookTicket(Ticket ticket){
        int ticketCost=200;
        double totalTicketPrice=ticket.quantity*ticketCost;
        TicketBookConfirm ticketBookConfirm=new TicketBookConfirm();
        ticketBookConfirm.movieName="TILLU";
        ticketBookConfirm.scanCode="AAAA";
        ticketBookConfirm.row=ticket.row;
        ticketBookConfirm.seatNumber=ticket.seat;

        return ticketBookConfirm;

    }

}