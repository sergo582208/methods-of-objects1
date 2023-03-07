public class Book {
    private String title;
    private int yearOfPublication;

    private Author author;

    public Book(String title, int yearOfPublication, Author author) {
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getTitle() {
        return title;

    }

    public Author getAuthor() {
        return author;
    }


    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
    public String toString(){
        return ("Название книги " + this.title + " Автор " + this.author.getFirstName() + " " + this.author.getLastName());
    }
}
