package POO2324EPn;

import java.util.Objects;

public class Place {
    String name;
    int capacidade;

    public Place(String name, int capacidade) {

        if (name == null || name.isEmpty())
        throw new IllegalArgumentException("Name cant be null");

        if (capacidade <= 0)
        throw new IllegalArgumentException("capacidade cant be less nor equal to zero");

        this.name = name;
        this.capacidade = capacidade;
    }

    public String getName() {
        return name;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty())
        throw new IllegalArgumentException("Name cant be null");

        this.name = name;
    }

    public void setCapacidade(int capacidade) {
        if (capacidade <= 0)
        throw new IllegalArgumentException("capacidade cant be less nor equal to zero");

        this.capacidade = capacidade;
    }

    public String toString() {
        return ("name:" + name + ", capacidade: " + capacidade);
    }

        public int hashCode() {
        return Objects.hash(name,capacidade);
    }
}
