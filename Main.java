public class Main {
    public static void main(String[] args) { // implements Comparable
        Library library = new Library();
        library.addBook(new Book("In Cold Blood", "Truman Capote", 1965, 15.99, "True Crime")); // = new Book
        library.addBook(new Book("Helter Skelter", "Vincent Bugliosi", 1974, 12.50, "True Crime")); 
        library.addBook(new Book("I'll Be Gone in the Dark", "Michelle McNamara", 2018, 20.00, "True Crime"));
        library.addBook(new Book("The Devil in the White City", "Erik Larson", 2003, 18.99, "True Crime"));
        library.addBook(new Book("The Stranger Beside Me", "Ann Rule", 1980, 14.75, "True Crime"));
        library.addBook(new Book("Mindhunter: Inside the FBI's Elite Serial Crime Unit", "John E. Douglas", 1995, 16.95, "True Crime"));
        library.addBook(new Book("People Who Eat Darkness", "Richard Lloyd Parry", 2011, 13.45, "True Crime"));
        library.addBook(new Book("The Killer Across the Table", "John E. Douglas", 2019, 22.50, "True Crime"));
        library.addBook(new Book("Columbine", "Dave Cullen", 2009, 11.20, "True Crime"));
        library.addBook(new Book("Lost Girls: An Unsolved American Mystery", "Robert Kolker", 2013, 19.99, "True Crime"));
        library.addBook(new Book("The Executioner's Song", "Norman Mailer", 1979, 16.50, "True Crime"));
        library.addBook(new Book("The Stranger in the Woods", "Michael Finkel", 2017, 21.25, "True Crime"));
        library.addBook(new Book("Green River, Running Red", "Ann Rule", 2004, 17.80, "True Crime"));
        library.addBook(new Book("Fatal Vision", "Joe McGinniss", 1983, 14.95, "True Crime"));
        library.addBook(new Book("The Good Nurse", "Charles Graeber", 2013, 20.50, "True Crime"));

        library.printBooksSortedByTitle(); // = new ArrayList
        System.out.println(); // = new ArrayList
        library.printBooksSortedByAuthor(); // = new ArrayList
        System.out.println(); //    = new ArrayList
        library.printBooksSortedByPublicationYear(); // = new ArrayList

        System.out.println("Author with most books: " + library.authorWithMostBooks()); // = new ArrayList
        System.out.println("Most popular genre: " + library.mostPopularGenre()); // = new ArrayList
        System.out.println("Year with most published books: " + library.yearWithMostPublishedBooks()); // = new ArrayList
    }
}
