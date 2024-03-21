package aula06;

import aula05.DateYMD;

public class Aluno extends Pessoa {
    private int numMec;
    private DateYMD dataInsc;
    private static int numMecCount = 100;
    


    public Aluno (String iNome, int iBI, DateYMD iDataNasc, DateYMD dataInsc) {
        super(iNome, iBI ,iDataNasc);

        if (dataInsc != null) {
            this.dataInsc = dataInsc;
        }

        numMecCount ++;
        this.numMec = numMecCount;
    }


    public Aluno (String iNome, int iBI, DateYMD iDataNasc) {
        super(iNome, iBI ,iDataNasc);

        numMecCount ++;
        this.numMec = numMecCount;

        dataInsc = DateYMD.now();
    }

    public int getNMec() {
        return numMec;
    }

    public DateYMD getDataInsc() {
        return dataInsc;
    }

    public void setDataInsc(DateYMD dataInsc) {
        this.dataInsc = dataInsc;
    }

    @Override
    public String toString() {
        return String.format("%s; Data de Inscrição: %d/%d/%d; num mecanografico: %d",
        super.toString(),
        this.dataInsc.getDay(),
        this.dataInsc.getMonth(),
        this.dataInsc.getYear(),
        this.numMec);
    }
}
