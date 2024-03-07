import java.util.*;
import java.util.stream.Collectors;

public class Library { // implements Comparable Library
    private List<Book> books; // = new ArrayList

    public Library() {
        books = new ArrayList<>(); // = new ArrayList
    }

    public void addBook(Book book) { // implements Comparable
        books.add(book); // = new ArrayList
    }

    public void printBooksSortedByTitle() { // implements Comparable
        List<Book> sortedBooks = new ArrayList<>(books);  // = new ArrayList
        sortedBooks.sort(Comparator.comparing(Book::getTitle)); // implements Comparable
        for (Book book : sortedBooks) {  // implements Comparable
            System.out.println(book);  // implements Comparable
        }
    }

    public void printBooksSortedByAuthor() {  // implements Comparable
        List<Book> sortedBooks = new ArrayList<>(books); // = new ArrayList
        sortedBooks.sort(Comparator.comparing(Book::getAuthor)); // implements Comparable
        for (Book book : sortedBooks) {  // implements Comparable
            System.out.println(book); // implements Comparable
        }
    }

    public void printBooksSortedByPublicationYear() { // implements Comparable
        List<Book> sortedBooks = new ArrayList<>(books); // = new ArrayList
        sortedBooks.sort(Comparator.comparingInt(Book::getYearOfPublication)); // implements Comparable
        for (Book book : sortedBooks) { // implements Comparable
            System.out.println(book); // implements Comparable
        }
    }

    public String authorWithMostBooks() { // implements Comparable
        Map<String, Long> authorBookCount = books.stream() // = new ArrayList
                .collect(Collectors.groupingBy(Book::getAuthor, Collectors.counting())); // implements Comparable

        Optional<Map.Entry<String, Long>> maxEntry = authorBookCount.entrySet().stream()  // implements Comparable
                .max(Map.Entry.comparingByValue()); // implements Comparable

        if (maxEntry.isPresent()) { // implements Comparable
            return maxEntry.get().getKey();  // implements Comparable
        } else {
            return "No books in the library"; // implements Comparable
        }
    }

    public String mostPopularGenre() { // implements Comparable
        Map<String, Long> genreCount = books.stream() // = new ArrayList
                .collect(Collectors.groupingBy(Book::getGenre, Collectors.counting())); // implements Comparable

        Optional<Map.Entry<String, Long>> maxEntry = genreCount.entrySet().stream() // implements Comparable
                .max(Map.Entry.comparingByValue()); // implements Comparable

        if (maxEntry.isPresent()) { // implements Comparable
            return maxEntry.get().getKey();  // implements Comparable
        } else {
            return "No books in the library"; // implements Comparable
        }
    }

    public int yearWithMostPublishedBooks() { // implements Comparable
        Map<Integer, Long> yearCount = books.stream() // = new ArrayList
                .collect(Collectors.groupingBy(Book::getYearOfPublication, Collectors.counting())); // implements Comparable

        Optional<Map.Entry<Integer, Long>> maxEntry = yearCount.entrySet().stream() // implements Comparable
                .max(Map.Entry.comparingByValue()); //  implements Comparable

        if (maxEntry.isPresent()) { // implements Comparable
            return maxEntry.get().getKey(); // implements Comparable
        } else {
            return -1; // implements Comparable
        }
    }
}
