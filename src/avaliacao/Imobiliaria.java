package avaliacao;

import java.util.ArrayList;

public abstract class Imobiliaria {

    int numImoveis;

    public Imobiliaria (int numImoveis) {
        if (numImoveis < 0) {
            throw new IllegalArgumentException("preço base invalido, nao pode ser inferior a zero");
        }
        this.numImoveis = numImoveis;
    }

    ArrayList<Object> imoveis = new ArrayList<>(numImoveis);

    public void addImovel(Object imovel) {
        if (imovel.getClass() == imovel) imoveis.add(imovel);
    }

    public toString() {
        for (Object i : imoveis) {
            System.out.println(i);
        }
    }

}
