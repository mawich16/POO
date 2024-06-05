package POO2324EPn;

public class EventOccurrence {
    Event event;
    Place place;
    String schedule;

        public EventOccurrence(Event event, Place place, String schedule) {

        if (schedule == null || schedule.isEmpty())
        throw new IllegalArgumentException("Schedule cant be null");

        if (event == null)
        throw new IllegalArgumentException("Event cant be null");

        if (place == null)
        throw new IllegalArgumentException("Place cant be null");

        this.place = place;
        this.event = event;
        this.schedule = schedule;
    }

    public Place getPlace() {
        return place;
    }

    public Event getEvent() {
        return event;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        if (schedule == null || schedule.isEmpty())
        throw new IllegalArgumentException("Schedule cant be null");

        this.schedule = schedule;
    }

    public void setPlace(Place place) {
        if (place == null)
        throw new IllegalArgumentException("Place cant be null");

        this.place = place;
    }

    public void setEvent(Event event) {
        if (event == null)
        throw new IllegalArgumentException("Event cant be null");

        this.event = event;
    }

    public String toString() {
        return ("event:" + event + ", place: " + place + ", schedule: " + schedule);
    }

}
