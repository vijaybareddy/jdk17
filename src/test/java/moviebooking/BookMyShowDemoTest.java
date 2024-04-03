package moviebooking;

public class BookMyShowDemoTest {
    public static void main(String[] args) {
        Ticket ticket=new Ticket();
        BookService service=new BookService();
        service.bookTicket(ticket);

    }
}
