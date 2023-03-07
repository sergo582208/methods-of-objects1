public class book {
    private String title;
    private int yearOfPublication;

    private author author;

    public book(String title, int yearOfPublication, author author) {
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

    public author getAuthor() {
        return author;
    }


    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
    public String toString(){
        return ("Название книги " + this.title + " Автор " + this.author.getFirstName() + " " + this.author.getLastName());
    }
}
