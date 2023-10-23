package practice_code;

// Enum to represent types of library items
enum LibraryItemType {
    BOOK,
    DVD
}

// Abstract class representing a library item
abstract class LibraryItem {
    private String uniqueIdentifier;
    private String title;
    private boolean checkedOut;

    public LibraryItem(String uniqueIdentifier, String title) {
        this.uniqueIdentifier = uniqueIdentifier;
        this.title = title;
        this.checkedOut = false;
    }

    // Getter for uniqueIdentifier
    public String getUniqueIdentifier() {
        return uniqueIdentifier;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for checkedOut
    public boolean isCheckedOut() {
        return checkedOut;
    }

    // Setter for checkedOut
    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }
}

// Class representing a book, extending LibraryItem
class Book extends LibraryItem {
    private String author;
    private int numPages;

    public Book(String uniqueIdentifier, String title, String author, int numPages) {
        super(uniqueIdentifier, title);
        this.author = author;
        this.numPages = numPages;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Getter for numPages
    public int getNumPages() {
        return numPages;
    }
}

// Class representing a DVD, extending LibraryItem
class DVD extends LibraryItem {
    private String director;
    private int durationMinutes;

    public DVD(String uniqueIdentifier, String title, String director, int durationMinutes) {
        super(uniqueIdentifier, title);
        this.director = director;
        this.durationMinutes = durationMinutes;
    }

    // Getter for director
    public String getDirector() {
        return director;
    }

    // Getter for durationMinutes
    public int getDurationMinutes() {
        return durationMinutes;
    }
}

// Class representing the Library
 class Library {
    private LibraryItem[] items; // Array to store library items

    public Library(int maxItems) {
        items = new LibraryItem[maxItems];
    }

    // Method to add a new item to the library
    public void addItem(LibraryItem item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                System.out.println("Item added successfully.");
                return;
            }
        }
        System.out.println("Library is full. Cannot add more items.");
    }

    // Method to remove an item from the library
    public void removeItem(String uniqueIdentifier) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getUniqueIdentifier().equals(uniqueIdentifier)) {
                items[i] = null;
                System.out.println("Item removed successfully.");
                return;
            }
        }
        System.out.println("Item with unique identifier " + uniqueIdentifier + " not found in the library.");
    }

    // Method to check out an item
    public void checkOutItem(String uniqueIdentifier) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getUniqueIdentifier().equals(uniqueIdentifier)) {
                if (!items[i].isCheckedOut()) {
                    items[i].setCheckedOut(true);
                    System.out.println("Item checked out successfully.");
                    return;
                } else {
                    System.out.println("Item with unique identifier " + uniqueIdentifier + " is already checked out.");
                    return;
                }
            }
        }
        System.out.println("Item with unique identifier " + uniqueIdentifier + " not found in the library.");
    }

    // Method to return an item
    public void returnItem(String uniqueIdentifier) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getUniqueIdentifier().equals(uniqueIdentifier)) {
                if (items[i].isCheckedOut()) {
                    items[i].setCheckedOut(false);
                    System.out.println("Item with unique identifier " + uniqueIdentifier + " has been returned.");
                    return;
                } else {
                    System.out.println("Item with unique identifier " + uniqueIdentifier + " is not checked out.");
                    return;
                }
            }
        }
        System.out.println("Item with unique identifier " + uniqueIdentifier + " not found in the library.");
    }

    // Method to display information about an item
    public void displayItemInfo(String uniqueIdentifier) {
        for (LibraryItem item : items) {
            if (item != null && item.getUniqueIdentifier().equals(uniqueIdentifier)) {
                System.out.println("Title: " + item.getTitle());
                if (item instanceof Book) {
                    Book book = (Book) item;
                    System.out.println("Type: Book");
                    System.out.println("Author: " + book.getAuthor());
                    System.out.println("Number of Pages: " + book.getNumPages());
                } else if (item instanceof DVD) {
                    DVD dvd = (DVD) item;
                    System.out.println("Type: DVD");
                    System.out.println("Director: " + dvd.getDirector());
                    System.out.println("Duration (minutes): " + dvd.getDurationMinutes());
                }
                System.out.println("Checked Out: " + (item.isCheckedOut() ? "Yes" : "No"));
                return;
            }
        }
        System.out.println("Item with unique identifier " + uniqueIdentifier + " not found in the library.");
    }

    public static void Main(String[] args) {
        // Create a library with a maximum of 10 items
        Library library = new Library(10);

        // Add some items to the library
        LibraryItem book1 = new Book("B001", "Java Programming", "John Doe", 300);
        LibraryItem book2 = new Book("B002", "Introduction to Algorithms", "Jane Smith", 800);
        LibraryItem dvd1 = new DVD("D001", "Inception", "Christopher Nolan", 148);
        LibraryItem dvd2 = new DVD("D002", "The Matrix", "The Wachowskis", 136);

        library.addItem(book1);
        library.addItem(book2);
        library.addItem(dvd1);
        library.addItem(dvd2);

        // Check out a book
        library.checkOutItem("B001");

        // Return a book
        library.returnItem("B001");

        // Display information about an item
        library.displayItemInfo("D001");
    }
}

