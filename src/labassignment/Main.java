package labassignment;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Computer c1 = new Computer("234", "hd45", 23, 43, true);
        Computer c2 = new Computer("264", "hd45", 23, 43, true);
        Computer temp = c1.clone();
        if (c1.equals(c2)) {
            System.out.println("they are equal");
        } else {
            System.out.println("they are not equal");
        }
        System.out.println(temp);
    }

}
//    public void borrowItem(Book book) {
//        for (LibraryItem item : collection) {
//            if (item instanceof Book && item.equals(book) && !item.isBorrowed()) {
//                item.setBorrowed(true);
//                System.out.println("Book '" + item.toString() + "' has been borrowed.");
//                return;
//            }
//        }
//        System.out.println("Book not available for borrowing.");
//    }
//
//    public void returnItem(Book book) {
//        for (LibraryItem item : collection) {
//            if (item instanceof Book && item.equals(book) && item.isBorrowed()) {
//                item.setBorrowed(false);
//                System.out.println("Book '" + item.toString() + "' has been returned.");
//                return;
//            }
//        }
//        System.out.println("Book not found or not borrowed.");
//    }
//
//    public void displayAvailableItems() {
//        System.out.println("Available Items:");
//        for (LibraryItem item : collection) {
//            if (!item.isBorrowed()) {
//                System.out.println(item);
//            }
//        }
//    }
//
//    public void displayBorrowedItems() {
//        System.out.println("Borrowed Items:");
//        for (LibraryItem item : collection) {
//            if (item.isBorrowed()) {
//                System.out.println(item);
//            }
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Library library = new Library();
//
//        // Adding books to the library
//        Book book1 = new Book("Book 1", "Author 1", 2020, 300);
//        Book book2 = new Book("Book 2", "Author 2", 2021, 250);
//
//        library.addItem(book1);
//        library.addItem(book2);
//
//        // Borrowing and returning books
//        library.borrowItem(book1);
//        library.displayBorrowedItems();
//
//        library.returnItem(book1);
//        library.displayBorrowedItems();
//    }
//}

//    public void updateProduct(String name, double newPrice, int newStockQuantity) {
//        for (Product product : products) {
//            if (product.getName().equals(name)) {
//                product.setPrice(newPrice);
//                product.setStockQuantity(newStockQuantity);
//                return;
//            }
//        }
//        System.out.println("Product not found.");
//    }
//
//    public void removeProduct(String name) {
//        Iterator<Product> iterator = products.iterator();
//        while (iterator.hasNext()) {
//            Product product = iterator.next();
//            if (product.getName().equals(name)) {
//                iterator.remove();
//                return;
//            }
//        }
//        System.out.println("Product not found.");
//    }
//
//    public void displayAllProducts() {
//        for (Product product : products) {
//            System.out.println(product);
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        InventoryManager manager = new InventoryManager();
//
//        // Adding products
//        Product p1 = new Product("Product A", 10.0, 100);
//        Product p2 = new Product("Product B", 20.0, 50);
//
//        manager.addProduct(p1);
//        manager.addProduct(p2);
//
//        // Updating products
//        manager.updateProduct("Product A", 12.0, 80);
//
//        // Removing a product
//        manager.removeProduct("Product B");
//
//        // Display all products
//        manager.displayAllProducts();
//    }
//}
//
//
//// Enumeration for LibraryItemType
//enum LibraryItemType {
//    BOOK,
//    MAGAZINE
//}
//
//// LibraryItem class
//class LibraryItem {
//    private String title;
//    private String author;
//    private int year;
//    private boolean isBorrowed;
//    private LibraryItemType itemType;
//
//    public LibraryItem(String title, String author, int year, LibraryItemType itemType) {
//        this.title = title;
//        this.author = author;
//        this.year = year;
//        this.isBorrowed = false;
//        this.itemType = itemType;
//    }
//
//    public boolean isBorrowed() {
//        return isBorrowed;
//    }
//
//    public void setBorrowed(boolean borrowed) {
//        isBorrowed = borrowed;
//    }

    // Getters for title, author, year, and itemType
    // ...

//    @Override
//    public String toString() {
//        return "Title: " + title + ", Author: " + author + ", Year: " + year;
//    }
//}

// Book class (subclass of LibraryItem)
//class Book extends LibraryItem {
//    private int pageCount;
//
//    public Book(String title, String author, int year, int pageCount) {
//        super(title, author, year, LibraryItemType.BOOK);
//        this.pageCount = pageCount;
//    }
//
//    public int getPageCount() {
//        return pageCount;
//    }

    // Getter and setter for pageCount
    // ...
//}

// Library class
//class Library {
//    private List<LibraryItem> collection;
//
//    public Library() {
//        this.collection = new ArrayList<>();
//    }
//
//    public void addItem(LibraryItem item) {
//        collection.add(item);
//    }
//
//    public void borrowItem(Book book) {
//        for (LibraryItem item : collection) {
//            if (item instanceof Book && item.equals(book) && !item.isBorrowed()) {
//                item.setBorrowed(true);
//                System.out.println("Book '" + item.toString() + "' has been borrowed.");
//                return;
//            }
//        }
//        System.out.println("Book not available for borrowing.");
//    }
//
//    public void returnItem(Book book) {
//        for (LibraryItem item : collection) {
//            if (item instanceof Book && item.equals(book) && item.isBorrowed()) {
//                item.setBorrowed(false);
//                System.out.println("Book '" + item.toString() + "' has been returned.");
//                return;
//            }
//        }
//        System.out.println("Book not found or not borrowed.");
//    }
//
//    public void displayAvailableItems() {
//        System.out.println("Available Items:");
//        for (LibraryItem item : collection) {
//            if (!item.isBorrowed()) {
//                System.out.println(item);
//            }
//        }
//    }
//
//    public void displayBorrowedItems() {
//        System.out.println("Borrowed Items:");
//        for (LibraryItem item : collection) {
//            if (item.isBorrowed()) {
//                System.out.println(item);
//            }
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Library library = new Library();
//
//        // Adding books to the library
//        Book book1 = new Book("Book 1", "Author 1", 2020, 300);
//        Book book2 = new Book("Book 2", "Author 2", 2021, 250);
//
//        library.addItem(book1);
//        library.addItem(book2);
//
//        // Borrowing and returning books
//        library.borrowItem(book1);
//        library.displayBorrowedItems();
//
//        library.returnItem(book1);
//        library.displayBorrowedItems();
//    }
//}










