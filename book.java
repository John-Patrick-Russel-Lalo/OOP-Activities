package activity1;
public class book {
    private int book_number;
    private String title;
    private String author;
    private double price;

    public void setBook_Number(int number) {
        this.book_number = number;
    }

    public int getBook_Number() {
        return book_number;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
