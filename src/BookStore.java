public class BookStore {
    private Book[] books;
    private int count;
    public BookStore(int size) {
        books = new Book[size];
        count = 0;
    }
    public void add_book(Book book) {
        if (count < books.length) {
            books[count++] = book;
        }
    }
    public void remove_book(int maxage,int currentyear) {
        for (int i = 0; i < count ; i++) {
            if(currentyear-books[i].year > maxage) {
                books[i] = books[count-1];
                count--;
                i--;
            }
        }

    }
    public void buy_book(String isbn,int quantity,String email,String add) {
        for (int i = 0; i < count ; i++) {
            Book book = books[i];
            if(book.ISbn().equals(isbn)) {
                if (!book.is_available()){
                    System.out.println("book is not available");
                    return;
                }
                book.sold(quantity,email,add);
                return;
            }
        }
        System.out.println("book is not found");
    }
}
