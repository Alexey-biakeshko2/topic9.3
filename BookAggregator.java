import java.util.ArrayList;
import java.util.List;

public class BookAggregator {

  Book[] books;

  public BookAggregator(Book[] books) {
    this.books = books;
  }

  public List<Book> getBooksByAuthor(String author) {
    List<Book> result = new ArrayList<>();

    for (Book book : books) {
      if (book.author.equals(author)) {
        result.add(book);
      }
    }

    return result;
  }

  public List<Book> getBooksByPublisher(String publisher) {
    List<Book> result = new ArrayList<>();

    for (Book book : books) {
      if (book.publisher.equals(publisher)) {
        result.add(book);
      }
    }

    return result;
  }

  public List<Book> getBooksReleasedAfter(int year) {
    List<Book> result = new ArrayList<>();

    for (Book book : books) {
      if (book.yearOfPublication > year) {
        result.add(book);
      }
    }

    return result;
  }

  public static void main(String[] args) {
    Book[] books = new Book[5];

    books[0] = new Book(
        1,
        "Adventures of Huckleberry Finn",
        "Mark Twain",
        "publisher1",
        1884,
        366,
        10,
        1);

    books[1] = new Book(
        2,
        "The Adventures of Tom Sawyer",
        "Mark Twain",
        "publisher2",
        1876,
        216,
        10,
        1);

    books[2] = new Book(
        3,
        "The Old Man and the Sea",
        "Ernest Hemingway",
        "publisher1",
        1952,
        127,
        10,
        1);

    books[3] = new Book(
        4,
        "For Whom the Bell Tolls",
        "Ernest Hemingway",
        "publisher2",
        1940,
        416,
        10,
        0);

    books[4] = new Book(
        5,
        "Martin Eden",
        "Jack London",
        "publisher1",
        1909,
        480,
        10,
        0);

    BookAggregator aggregator = new BookAggregator(books);

    System.out.println("By author: Mark Twain");
    System.out.println(aggregator.getBooksByAuthor("Mark Twain"));

    System.out.println("By author: Ernest Hemingway");
    System.out.println(aggregator.getBooksByAuthor("Ernest Hemingway"));

    System.out.println("By author: Jack London");
    System.out.println(aggregator.getBooksByAuthor("Jack London"));

    System.out.println("By publisher: publisher1");
    System.out.println(aggregator.getBooksByPublisher("publisher1"));

    System.out.println("By publisher: publisher2");
    System.out.println(aggregator.getBooksByPublisher("publisher2"));

    System.out.println("Released after 1900");
    System.out.println(aggregator.getBooksReleasedAfter(1900));
  }

}