package aula08;

public class Carne extends Alimento {

    private VariedadeCarne tipo;

    public Carne(VariedadeCarne tipo, double proteinas, double calorias, double peso) {
        super(proteinas, calorias, peso);
        this.tipo = tipo;
    }

    public VariedadeCarne getTipo() {
        return tipo;
    }

    public void setTipo(VariedadeCarne tipo) {
        this.tipo = tipo;
    }

    public String toString() {
        return String.format("Carne %s, %s", tipo, super.toString());
    }

    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Carne other = (Carne) obj;
        if (tipo != other.tipo)
            return false;
        return true;
    }

}
