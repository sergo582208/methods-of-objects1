public class Main {
    public static void main(String[] args) {
        author author = new author("Oskar", "Wylde");
        author author1 = new author("Oskar", "Wylde");
        if (author == author1) {
            System.out.println("Равны через == ");
        } else {
            System.out.println("Равны через ++");
        }

        if (author.equals(author1)) {
            System.out.println("Равны через .equals()");
        } else {
            System.out.println("Вообще не равны через .equals()");
        }


        book book = new book("Dorian Grey", 1890, author);


        System.out.println(book.getYearOfPublication());
        book.setYearOfPublication(1876);
        System.out.println(book.getYearOfPublication());

        System.out.println(book.getAuthor().getFirstName());
        System.out.println(book.getAuthor().getLastName());
        System.out.println(book.getTitle());
        System.out.println(book);


    }
    }
