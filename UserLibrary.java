import java.util.ArrayList;

public class UserLibrary {
    private ArrayList<UserBook> books = new ArrayList<>();

    // Add a book to the library
    public void addBook(UserBook book) {
        books.add(book);
    }

    // Display all books in the library
    public void displayLibrary() {
        for (UserBook book : books) {
            book.printBookInfo();
        }
    }

    // Borrow a book by title
    public void borrowBook(User user, String bookTitle) {
        for (UserBook book : books) {
            if (book.getTitle().equalsIgnoreCase(bookTitle)) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    user.borrowBook(bookTitle);
                    System.out.println("\nYou have successfully borrowed: " + bookTitle);
                } else {
                    System.out.println("\nSorry, the book is currently unavailable.");
                }
                return; // Exit the loop once the book is found
            }
        }
        System.out.println("\nSorry, the book is not available in the library.");
    }
}
