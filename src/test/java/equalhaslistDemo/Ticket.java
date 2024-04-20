package equalhaslistDemo;

import java.util.Objects;

public class Ticket {
    public String name;
    public String pnr;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Ticket ticket = (Ticket) object;
        return Objects.equals(name, ticket.name) && Objects.equals(pnr, ticket.pnr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pnr);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "name='" + name + '\'' +
                ", pnr='" + pnr + '\'' +
                '}';
    }
}


