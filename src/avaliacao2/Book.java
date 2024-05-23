package avaliacao2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Book {

    String nome, autor, editora, ISBN, dataLancamento;
    int id, idCount=0;
    LocalDate data;

    public Book(String nome, String autor, String editora, String ISBN, String dataLancamento) {
        this.nome=nome;
        this.autor=autor;
        this.editora=editora;
        this.ISBN=ISBN;
        this.dataLancamento=dataLancamento;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.data=LocalDate.parse(dataLancamento,formatter);

        idCount++;
        this.id=idCount;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getId() {
        return id;
    }

    public LocalDate getData() {
        return data;
    }


    public void setAutor (String autor) {
        this.autor=autor;
    }

    public void setEditora (String editora) {
        this.editora=editora;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }

    public void setISBN(String ISBN) {
        this.ISBN=ISBN;
    }

    public void setData(String dataLancamento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.data=LocalDate.parse(dataLancamento,formatter);
    }

    public boolean isEqual(Book book) {
        if (this.id == book.getId()) return true;
        
        return this.nome == book.getNome() && this.autor == book.getAutor() && this.editora == book.getEditora() && this.data == book.getData() && this.ISBN == book.getISBN();
    }

    public String toString() {
        return String.format("%d: %s de %s, publicado por %s a %s, %s ", id, nome, autor, editora, dataLancamento, ISBN);
    }

    public int hashCode() {
        return Objects.hash(id, nome, autor, editora, dataLancamento, ISBN);
    }
}