package avaliacao;

public class Casa extends Imovel{
    int  numQuartos, numPisos;

    public Casa (String morada, int precoBase, int area, int getNumQuartos, int numPisos) {
        super(morada, precoBase, area);

        if (numQuartos < 0) {
            throw new IllegalArgumentException("numero de quartos invalido, nao pode ser inferior a zero");
        }

        if (numPisos < 0) {
            throw new IllegalArgumentException("numero de pisos invalido, nao pode ser inferior a zero");
        }

        this.numPisos = numPisos;
        this.numQuartos = numQuartos;
    }

    public int getNumQuartos() {
        return numQuartos;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumQuartos(int numQuartos) {
        if (numQuartos < 0) {
            throw new IllegalArgumentException("numero de quartos invalido, nao pode ser menor de zero");
        }
        this.numQuartos = numQuartos;
    }

    public void setNumPisos(int numPisos) {
        if (numQuartos < 0) {
            throw new IllegalArgumentException("numero de pisos invalido, nao pode ser menor de zero");
        }
        this.numPisos = numPisos;
    }

    public String toString() {
        return String.format("%s, Numero de Quartos: %d, Numero de Pisos: %d",
        super.toString(),
        this.numQuartos,
        this.numPisos);
    }
}
