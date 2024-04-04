package avaliacao;

public class Imovel extends Imobiliaria{

    String morada;
    int precoBase, area, id;
    private static int idCount = 100;

    public Imovel (String morada, int precoBase, int area) {
        if (precoBase < 0) {
            throw new IllegalArgumentException("preço base invalido, nao pode ser inferior a zero");
        }

        if (morada == null) {
            throw new IllegalArgumentException("morada invalida, nao pode ser nulo");
        }

        if (area < 0) {
            throw new IllegalArgumentException("area invalida, nao pode ser inferior a zero");
        }

        this.precoBase = precoBase;
        this.morada = morada;
        this.area = area;
        idCount++;
        id = idCount;
    }

    public String getMorada() {
        return morada;
    }

    public int getPrecoBase() {
        return precoBase;
    }

    public int getArea() {
        return area;
    }

    public void setMorada(String morada) {
        if (morada == null) {
            throw new IllegalArgumentException("morada invalida, nao pode ser nulo");
        }
        this.morada = morada;
    }

    public void setArea(int area) {
        if (area < 0) {
            throw new IllegalArgumentException("area invalida, nao pode ser menor de zero");
        }
        this.area = area;
    }

    public void setPrecoBase(int precoBase) {
        if (precoBase < 0) {
            throw new IllegalArgumentException("preco base invalido, nao pode ser menor de zero");
        }
        this.precoBase = precoBase;
    }

    public String toString() {
        return String.format("ID: %d; Morada: %s; Preço de Base de Venda: %d; Area Total: %d",
        this.id,
        this.morada,
        this.precoBase,
        this.area);
    }
}
