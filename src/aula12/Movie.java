package aula12;

public class Movie {
    private String name;
    private double score;
    private String rating;
    private String genre;
    private int rt;

    public Movie(String name, double score, String rating, String genre, int rt){
        this.name = name;
        this.score = score;
        this.rating = rating;
        this.genre = genre;
        this.rt = rt;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return this.score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRt() {
        return this.rt;
    }

    public void setRt(int rt) {
        this.rt = rt;
    }

    public String toString() {
        return "Name:" + this.name + "; Score:" + this.score + "; Rating:" + this.rating + "; Genre:" + this.genre + "; RT:" +rt;
    }
}
