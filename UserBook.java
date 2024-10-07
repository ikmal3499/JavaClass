public class UserBook {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable = true;

    // Constructor
    public UserBook(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // Print book information
    public void printBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Available: " + isAvailable);
    }

}
