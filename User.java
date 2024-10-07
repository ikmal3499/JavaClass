import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class User {
    private String name;
    private int age;
    private String bookTitle;
    ArrayList<String> borrowedBooks = new ArrayList<>();

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM-dd-yyyy");
    LocalDate dueDate = LocalDate.now().plusDays(14);

    // Constructor
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    // Methods for borrowing and returning books
    public void borrowBook(String bookTitle) {
        borrowedBooks.add(bookTitle);
    }

    public void returnBook(String bookTitle) {
        borrowedBooks.remove(bookTitle);
    }

    // Display user details and borrowed books
    public void displayDetails() {
        System.out.println("\nUser: " + name);
        if (borrowedBooks.size() > 0) {
            System.out.println("Borrowed Books: ");
            for (String b : borrowedBooks) {
                System.out.println("- " + b);
            }
            System.out.println("Due Date: " + dueDate.format(formatter));
        } else {
            System.out.println("No borrowed books.");
        }
    }
}
