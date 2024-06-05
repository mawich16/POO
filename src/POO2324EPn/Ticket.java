package POO2324EPn;

public class Ticket {
    
    int num;
    Place place;
    int ref;

    public Ticket(int num, Place place, int ref) {

        if (num <= 0)
        throw new IllegalArgumentException("Number of tickets cant be less nor equal to zero");

        if (ref <= 0)
        throw new IllegalArgumentException("Reference cant be less nor equal to zero");

        if (place == null)
        throw new IllegalArgumentException("Place cant be null");

        this.place = place;
        this.num = num;
        this.ref = ref;
    }

    public Place getPlace() {
        return place;
    }

    public int getRef() {
        return ref;
    }

    public int getNum() {
        return num;
    }

    public void setRef(int ref) {
        if (ref <= 0)
        throw new IllegalArgumentException("Refence cant be less nor equal to zero");

        this.ref = ref;
    }

    public void setPlace(Place place) {
        if (place == null)
        throw new IllegalArgumentException("Place cant be null");

        this.place = place;
    }

    public void setNum(int num) {
        if (num <= 0)
        throw new IllegalArgumentException("Number of tickets cant be less nor equal to zero");

        this.num = num;
    }

    public String toString() {
        return ("number of tickets:" + num + ", place: " + place + ", reference: " + ref);
    }
}
