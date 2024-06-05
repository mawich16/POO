package POO2324EPn;

public class Cinema extends Event {
    String realizador;
    int ano;
    String[] atores;

    public Cinema (String name,  String realizador, int ano, String[] atores, int duration) {
        super(name, duration);

        if (realizador == null || realizador.isEmpty())
        throw new IllegalArgumentException("realizador cant be null");

        if (ano <= 0)
        throw new IllegalArgumentException("ano cant be less nor equal to zero");

        if (atores == null || atores.length == 0 )
        throw new IllegalArgumentException("atores list cant be null nor empty");

        this.ano=ano;
        this.atores=atores;
        this.realizador=realizador;
    }

    public String getRealizador() {
        return realizador;
    }

    public String[] getAtores() {
        return atores;
    }

    public int getAno() {
        return ano;
    }

    public void setRealizador(String realizador) {
        if (realizador == null || realizador.isEmpty())
        throw new IllegalArgumentException("realizador cant be null");
        this.realizador=realizador;
    }

    public void setAno(int ano) {
        if (ano <= 0)
        throw new IllegalArgumentException("ano cant be less nor equal to zero");
        this.ano=ano;
    }

    public void setAtores(String[] atores) {
        if (atores == null || atores.length == 0)
        throw new IllegalArgumentException("atores list cant be null nor empty");
        this.atores=atores;
    }

    public String toString() {
        return super.toString() + ", realizador: " + realizador + ", ano: " + ano + "atores: " + atores ;
    }
}