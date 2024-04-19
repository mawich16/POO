package aula09;

public class MilitaryPlane extends Plane {
    public static final String PLANE_TYPE = "Militar";

    private int numMunicoes;

    public MilitaryPlane(String id, String fabricante, String modelo, int anoProducao, int maxPassageiros,int velocidadeMaxima, int numMunicoes) {
        super(id, fabricante, modelo, anoProducao, maxPassageiros, velocidadeMaxima);
        this.setNumMunicoes(numMunicoes);
    }

    public int getNumMunicoes() {
        return numMunicoes;
    }

    public String getPlaneType() {
        return PLANE_TYPE;
    }

    public void setNumMunicoes(int numMunicoes) {
        if (numMunicoes < 0)
            throw new IllegalArgumentException("O num de muniçoes nao pode ser menor que 0");

        this.numMunicoes = numMunicoes;
    }

    public String toString() {
        return "Military " + super.toString() + ", muniçoes: " + numMunicoes;
    }
}
