package Metro;

public class Test {
    public static void main(String[] args) {

        platform loc = new platform();
        Train train = new Train();
        train.trainName = "Express";
        loc.platformNo = "2";
        MetroStation metroStation = new MetroStation();
        metroStation.from = "LB NAGAR";
        metroStation.to = "MIYAPUR";
        Ticket ticket = new Ticket();
        metroStation.from = "LB NAGAR";
        metroStation.to = "MIYAPUR";
        ticket.price = 60;
        System.out.println("platFrom#: " + loc.platformNo);
        System.out.println("from: " + metroStation.from);
        System.out.println("To: " + metroStation.to);
        System.out.println("Train Name: " + train.trainName);
        System.out.println("Ticket price:" + ticket.price);
    }
}
