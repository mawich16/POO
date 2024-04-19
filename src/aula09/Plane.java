package aula09;

import java.util.Objects;

public abstract class Plane {
    private String id;
    private String fabricante;
    private String modelo;
    private int anoProducao;
    private int maxPassageiros;
    private int velocidadeMaxima;

    public Plane(String id, String fabricante, String modelo, int anoProducao, int maxPassageiros,int velocidadeMaxima) {
        if (id == null || id.isEmpty())
            throw new IllegalArgumentException("O id nao pode ser nulo");

        if (fabricante == null || fabricante.isEmpty())
            throw new IllegalArgumentException("O fabricante nao pode ser nulo");

        if (modelo == null || modelo.isEmpty())
            throw new IllegalArgumentException("O modelo nao pode ser nulo");

        this.id = id;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.anoProducao = anoProducao;
        this.setMaxPassageiros(maxPassageiros);
        this.setVelocidadeMaxima(velocidadeMaxima);
    }

    public String getId() {
        return id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoProducao() {
        return anoProducao;
    }

    public int getMaxPassageiros() {
        return maxPassageiros;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public abstract String getPlaneType();

    public void setMaxPassageiros(int maxPassageiros) {
        if (maxPassageiros < 0)
            throw new IllegalArgumentException("O num de passageiros nao pode ser menor que 0");

        this.maxPassageiros = maxPassageiros;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        if (velocidadeMaxima <= 0)
            throw new IllegalArgumentException("A velocidade maxima tem de ser maior que 0");

        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String toString() {
        return String.format("Plane %s, %s %d, %s, passageiros: %d, velocidade máxima: %d",
        this.id,
        this.modelo,
        this.anoProducao,
        this.fabricante,
        this.maxPassageiros,
        this.velocidadeMaxima);
    }



    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Plane plane = (Plane) o;
        return Objects.equals(id, plane.id);
    }

    public int hashCode() {
        return Objects.hash(id);
    }
}