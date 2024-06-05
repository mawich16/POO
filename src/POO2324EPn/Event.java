package POO2324EPn;

import java.util.Objects;

public abstract class Event {
    private String name;
    private int duration;

    public Event(String name, int duration) {

        if (name == null || name.isEmpty())
        throw new IllegalArgumentException("Name cant be null");

        if (duration <= 0)
        throw new IllegalArgumentException("duration cant be less nor equal to zero");

        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty())
        throw new IllegalArgumentException("Name cant be null");

        this.name = name;
    }

    public void setDuration(int duration) {
        if (duration <= 0)
        throw new IllegalArgumentException("duration cant be less nor equal to zero");

        this.duration = duration;
    }

    public String toString() {
        return ("name:" + name + ", duration: " + duration);
    }

        public int hashCode() {
        return Objects.hash(name,duration);
    }

}
