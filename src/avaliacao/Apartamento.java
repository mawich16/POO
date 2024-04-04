package avaliacao;

public class Apartamento extends Imovel {

    int numQuartos;

    public Apartamento (String morada, int precoBase, int area, int numQuartos) {
        super(morada, precoBase, area);

        if (numQuartos < 0) {
            throw new IllegalArgumentException("numero de quartos invalido, nao pode ser inferior a zero");
        }
        this.numQuartos = numQuartos;
    }

    public int getNumQuartos() {
        return numQuartos;
    }

    public void setNumQuartos(int numQuartos) {
        if (numQuartos < 0) {
            throw new IllegalArgumentException("numero de quartos invalido, nao pode ser menor de zero");
        }
        this.numQuartos = numQuartos;
    }

    public String toString() {
        return String.format("%s, Numero de Quartos: %d",
        super.toString(),
        this.numQuartos);
    }

}
