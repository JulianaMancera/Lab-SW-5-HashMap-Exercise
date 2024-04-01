import java.util.HashMap;

public static void main(String[] args) {
    BookDA bookDA = new BookDA();
    AuthorDA authorDA = new AuthorDA();

    HashMap<String, Book> books = bookDA.getBooks("Book.csv");
    HashMap<String, Author> authors = authorDA.getAuthors("Author.csv");

    for (String isbn : books.keySet()) {
        Book book = books.get(isbn);
        Author author = authors.get(book.getAuthorName());
        System.out.println(book.getIsbn() + " " + book.getTitle());
        System.out.println("\t" + author.getName() + " - " + author.getBio() + "\n");
    }
}

