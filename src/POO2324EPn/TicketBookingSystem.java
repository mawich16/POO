package POO2324EPn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TicketBookingSystem implements ITicketBookingSystem {

    private Map<Integer, EventOccurrence> eventOccurrences;
    private Map<Integer, Ticket> tickets;
    private int inicialTicketRef = 1;

    public TicketBookingSystem() {
        this.eventOccurrences = new HashMap<>();
        this.tickets = new HashMap<>();
    }

    public boolean addEventOccurrence(Event event, Place place, String schedule) {
        int eventOccurrenceRef = 1000 + eventOccurrences.size() + 1;
        EventOccurrence occurrence = new EventOccurrence(event, place, schedule);

        for (EventOccurrence existingOccurrence : eventOccurrences.values()) {
            if (existingOccurrence.getPlace().equals(place) && existingOccurrence.getSchedule().equals(schedule)) {
                return false;
            }
        }

        eventOccurrences.put(eventOccurrenceRef, occurrence);
        return true;
    }

    public int bookTickets(int eventId, int numTickets) {
        EventOccurrence occurrence = eventOccurrences.get(eventId);

        if (occurrence == null) {
            return -1;
        }


        if (!areTicketsAvailable(occurrence, numTickets)) {
            return -1;
        }


        int ticketRef = inicialTicketRef++;
        Ticket ticket = new Ticket(numTickets, occurrence.getPlace(), ticketRef);
        tickets.put(ticketRef, ticket);

        return ticketRef;
    }

    public boolean cancelTickets(int ticketReference) {
        Ticket ticket = tickets.get(ticketReference);

        if (ticket == null) {
            return false;
        }

        tickets.remove(ticketReference);
        return true;
    }

    public Collection<EventOccurrence> getEventOccurrences() {
        return new ArrayList<>(eventOccurrences.values());
    }

    private boolean areTicketsAvailable(EventOccurrence occurrence, int numTickets) {

        int[] ticketReferences = new int[100];
        for (int i=0; i<ticketReferences.length; i++) {
            int eventId = 1000 + (i % 12); 
            ticketReferences[i] = bookTickets(eventId, 10);

            if (ticketReferences[i] < 0) return false;
        }
        return true;
    }
}
