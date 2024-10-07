import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        UserBook[] books = new UserBook[3];
        User user = new User(null, 0);
        Scanner scan = new Scanner(System.in);
        UserLibrary lib = new UserLibrary();

        // Sample book data
        String[] title = {"Harry Potter", "Lord of the Rings", "Percy Jackson"};
        String[] author = {"J. K. Rowling", "J.R.R. Tolkien", "Rick Riordan"};
        String[] isbn = {"abc123", "def456", "ghi789"};

        // Create and add books to the library
        for (int i = 0; i < title.length; i++) {
            books[i] = new UserBook(title[i], author[i], isbn[i]);
            lib.addBook(books[i]);
        }

        // Get user details
        System.out.print("Name: ");
        user.setName(scan.next());
        System.out.print("Age: ");
        user.setAge(scan.nextInt());
        scan.nextLine(); // Consume newline

        // Display available books
        System.out.println("\nAvailable Books in Library:");
        lib.displayLibrary();

        // Ask user for the book they want to borrow
        System.out.print("\nEnter the title of the book you want to borrow: ");
        String bookTitle = scan.nextLine();
        user.setBookTitle(bookTitle);

        // Try borrowing the book
        lib.borrowBook(user, bookTitle);

        // Display user details and borrowed book info
        user.displayDetails();
    }
}
