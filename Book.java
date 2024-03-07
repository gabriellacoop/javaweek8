public class Book { 
    private String title;// implements Comparable
    private String author; // implements Comparable
    private int yearOfPublication; // implements Comparable
    private double price; // implements Comparable
    private String genre; // implements Comparable

    public Book(String title, String author, int yearOfPublication, double price, String genre) { // implements Comparable
        this.title = title; // implements Comparable
        this.author = author; // implements Comparable
        this.yearOfPublication = yearOfPublication; // implements Comparable
        this.price = price;
        this.genre = genre;
    }

    public String getTitle() { // implements Comparable
        return title;
    }

    public String getAuthor() { // implements Comparable
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public double getPrice() {
        return price;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() { // implements Comparable
        return "Title: " + title + ", Author: " + author + ", Year: " + yearOfPublication + // implements Comparable
                ", Price: $" + price + ", Genre: " + genre; // implements Comparable
    }
}
