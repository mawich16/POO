package avaliacao2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class BookManager implements IBookCostCalculator {

    List<Book> Books = new ArrayList<>();
    int i=0; //variavel para verificar se o livro esta ou nao na lista

    public void addBook(Book book) {
        Iterator<Book> it = Books.iterator();
        while (it.hasNext()) {
            if (((Book) it).getISBN() == book.getISBN()){
                System.out.println("esse livro ja existe");
                //se o livro estiver na lista o valor de i é alterado
                i=1;
            }
        }
        //se o valor de i nao for alterado entao o livro é adicionado à lista
        if (i==0) Books.add(book);
        
        i=0;
    }

    public void removeBook(int id) {
        Iterator<Book> it = Books.iterator();
        while (it.hasNext()) {
            if (((Book) it).getId() == id){
                Books.remove((Book)it);
            }
        }
    }

    public Book getBook(int id) {
        Iterator<Book> it = Books.iterator();
        while (it.hasNext()) {
            if (((Book) it).getId() == id){
                return ((Book)it);
            }
        }
        return null;
    }

    public String printAllBooks() {
        for (Book b : Books) {
            return b.toString();
        }
        return null;
    }

    public void readFile(String file) throws FileNotFoundException {
        Scanner input = new Scanner(new FileReader(file));

        input.useDelimiter("(\\||[\\r\\n]+)");

        while (input.hasNext()) {
            String nome = input.next();
            String autor = input.next();
            String editora = input.next();
            String ISBN = input.next();
            String dataLancamento = input.next();

            addBook(new Book(nome, autor, editora, ISBN, dataLancamento));

            input.nextLine();
        }

        input.close();
    }

    public double calculateCost(int days) {
        if (days <= 6) return 3;
        else {
            return 3+(0.8*(days-6));
        }
    }

    public double BookCostCalculator(int days, int id) {
        Iterator<Book> it = Books.iterator();
        while (it.hasNext()) {
            if (((Book) it).getId() == id){
                return calculateCost(days);
            }
        }
        return 0;
    }

    public double calculateBookLoanCost(int days, int id) {
        return BookCostCalculator(days, id);
    }

    public void writeFile(String file) throws IOException {
        PrintWriter out = new PrintWriter(new File(file));
        Iterator<Book> it = Books.iterator();
        while (it.hasNext()) {
            out.printf("%s  %s  %s  %s  %s", ((Book)it).getNome(), ((Book)it).getAutor(), ((Book)it).getEditora(), ((Book)it).getISBN(), ((Book)it).getData());
        }
        out.close();
    }
}
