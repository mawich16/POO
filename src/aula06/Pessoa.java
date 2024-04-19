package aula06;

import java.util.Objects;

import aula05.DateYMD;

public class Pessoa {
    private String nome;
    private int cc;
    private DateYMD dataNasc;

    public Pessoa(String nome, int cc, DateYMD dataNasc) {
        if (nome == null || nome.length() == 0) {
            throw new IllegalArgumentException("o  nome não pode estar vazio");
        }

        if (cc == 0 || cc < 0) {
            throw new IllegalArgumentException("o  numero de cc não pode ser 0 ou negativo, ciar novamente");
        }

        if (dataNasc == null) {
            throw new IllegalArgumentException("a data de nascimento nao pode vazia, ciar novamente");
        }

        this.nome = nome;
        this.cc = cc;
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() > 0) {
        this.nome = nome;
        }
    }

    public int getCC() {
        return cc;
    }

    public void setCC(int cc) {
        if (cc > 0) {
            this.cc = cc;
        }
    }

    public DateYMD getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(DateYMD dataNasc) {
        this.dataNasc = dataNasc;
    }

    @Override
    public String toString() {
        return String.format("%s; CC: %d; Data de Nascimento: %d/%d/%d",
        this.nome,
        this.cc,
        this.dataNasc.getDay(),
        this.dataNasc.getMonth(),
        this.dataNasc.getYear());
    }

    public int hashCode() {
        return Objects.hash(cc);
    }

    
}
