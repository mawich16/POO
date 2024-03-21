package aula06;

import aula05.DateYMD;

public class Bolseiro extends Aluno {
    private int valorBolsa;
    private Professor orientador;

    public Bolseiro (String iNome, int iBI, DateYMD iDataNasc, Professor orientador , int valorBolsa) {
        super(iNome, iBI, iDataNasc);

        if (orientador != null) {
            this.orientador = orientador;
        }

        if (valorBolsa > 0) {
            this.valorBolsa = valorBolsa;
        }
    }

    public Professor getOrientador() {
        return orientador;
    }

    public void setOrientador (Professor orientador) {
        if (orientador != null) {
            this.orientador = orientador;
        }
    }

    public int getBolsa() {
        return valorBolsa;
    }

    public void setBolsa (int valorBolsa) {
        if (valorBolsa > 0) {
            this.valorBolsa = valorBolsa;
        }
    }

    @Override
    public String toString() {
        return String.format("%s; Professor Orientador: %s; Valor da Bolsa: %d",
        super.toString(),
        this.orientador,
        this.valorBolsa);
    }

}
