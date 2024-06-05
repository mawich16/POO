package POO2324EPn;

public class Theatre extends Event {
    String companhia;
    String ator;

    public Theatre (String name, String ator, String companhia, int duration) {
        super(name, duration);

        if (companhia == null || companhia.isEmpty())
        throw new IllegalArgumentException("companhia cant be null");

        if (ator == null || ator.isEmpty())
        throw new IllegalArgumentException("ator cant be null nor empty");

        this.companhia=companhia;
        this.ator=ator;
    }

    public String getAtor() {
        return ator;
    }

    public String getCompanhia() {
        return companhia;
    }

    public void setAtor(String ator) {
        if (ator == null || ator.isEmpty())
        throw new IllegalArgumentException("ator cant be null");
        this.ator=ator;
    }

    public void setCompanhia(String companhia) {
        if (companhia == null || companhia.isEmpty())
        throw new IllegalArgumentException("companhia cant be null");
        this.companhia=companhia;
    }

    public String toString() {
        return super.toString() + ", companhia: " + companhia + ", ator: " + ator;
    }
}