package equalhaslistDemo;

import java.util.*;

public class MapDemoTest {
    public static void main(String[] args) {

        Map<Integer,Ticket>ticketMap= new HashMap<>();
        List<Ticket>ticketList=new ArrayList<>();

        for (int i=0;i<100000;i++){
            Ticket ticket=new Ticket();
            ticket.pnr="9876655433"+i;
            ticket.name="Vijay";

            Ticket ticket1=new Ticket();
            ticket1.pnr="9876655433";
            ticket1.name="Vijay";

            ticketList.add(ticket);
            ticketMap.put(ticket.hashCode(),ticket);

        }
       /*  Set<Map.Entry<Integer,Ticket>>entrySet=ticketMap.entrySet();
        Iterator<Map.Entry<Integer,Ticket>>iterator= entrySet.iterator();
        for (;iterator.hasNext();){
            Map.Entry<Integer,Ticket>entry=iterator.next();
            System.out.println("key"+entry.getKey()+"value "+ entry.getValue());
        }*/
        ticketMap.forEach((k,v)->{
            System.out.println("key from foreach "+ k + " value "+v);
        });

        Ticket findTicket = new Ticket();
        findTicket.pnr="987665543350000";
        findTicket.name="Vijay";
        System.out.println("  getting from  list");
        long listStartTime =System.currentTimeMillis();
        Iterator<Ticket>ticketIterator = ticketList.iterator();

        for (; ticketIterator.hasNext();){
            Ticket tt = ticketIterator.next();
            if (tt.equals(findTicket)){
                System.out.println("find the ticket"+tt.pnr);
                break;
            }

        }

        long listEndTime = System.currentTimeMillis();
        System.out.println("time taken "+(listEndTime-listStartTime));
        System.out.println(" getting Ticket from map ");
        long mapListStartTime = System.currentTimeMillis();
        Ticket mapTicket = ticketMap.get(findTicket.hashCode());
        System.out.println(" find the ticket from map " +  mapTicket.pnr);
        long mapListEndTime = System.currentTimeMillis();
        System.out.println(" time taken from map  "  +   (mapListEndTime-mapListStartTime));


    }
}