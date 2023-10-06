package list.livros;

public class Book {
    private String author;
    private  String title;

    private Integer publishYear;

    public Book(String author, String title, Integer publishYear) {
        this.author = author;
        this.title = title;
        this.publishYear = publishYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public Integer getPublishYear() {
        return publishYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", PublishYear=" + publishYear +
                '}';
    }
}