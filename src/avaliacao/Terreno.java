package avaliacao;

public class Terreno extends Imovel {

    String tipoTerreno;

    public Terreno (String morada, int precoBase, int area, String tipoTerreno) {
        super(morada, precoBase, area);

        if (tipoTerreno != "urbano" && tipoTerreno != "rústico") {
            throw new IllegalArgumentException("tipo de terreno invalido, tem de ser 'urbano' ou rústico' ");
        }
        this.tipoTerreno = tipoTerreno;
    }

    public String geTipoTerreno() {
        return tipoTerreno;
    }

    public void setTipoTerreno(String teipoTerreno) {
        if (tipoTerreno != "urbano" && tipoTerreno != "rústico") {
            throw new IllegalArgumentException("tipo de terreno invalido, tem de ser 'urbano' ou rústico' ");
        }
        this.tipoTerreno = tipoTerreno;
    }

    public String toString() {
        return String.format("%s, Tipo de Terreno (urbano ou rústico): %d",
        super.toString(),
        this.tipoTerreno);
    }

}
