package aula06;

import aula05.DateYMD;

public class Professor extends Pessoa {
    private String categoria;
    private String departamento;

    public Professor(String iNome, int iBI, DateYMD iDataNasc, String categoria, String departamento) {
        super(iNome, iBI, iDataNasc);

        if (validateCategoria(categoria) == true) {
            this.categoria = categoria;
        }

        this.departamento = departamento;
    }

    private static boolean validateCategoria(String categoria) {
        switch (categoria) {
            case "Auxiliar":
            case "Associado":
            case "Catedrático":
                return true;
            default:
                System.out.println("a categoria tem de ser uma de “Auxiliar”, “Associado”, “Catedrático”");
                return false;
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if (validateCategoria(categoria) == true) {
            this.categoria = categoria;
        }
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departameto) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return String.format("%s; Categoria: %s; Departamento: %s",
        super.toString(),
        this.categoria,
        this.departamento);
    }
}
