public class Book {
    private String title;
    private int year;
    private Author author;

    Book(String title, Author author, int year) {
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public String getTitle() { return title; }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() { return year; }

    public void setYear(int year) {
        this.year = year;
    }

    public Author getAuthor() { return author; }

    public String toString() {
        return String.format("Информация о книге: название %s, автор %s, год %s",
                title, author.getName(), year);
    }

}
