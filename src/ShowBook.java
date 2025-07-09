public class ShowBook extends Book {
    public ShowBook(String title, String isbn, int year,double price) {
        super(title, isbn, year, price);
    }
    @Override
    public boolean is_available() {
        return true;
    }
    @Override
    public void  send(String email,String add) {
        System.out.println("this book is for showcase only");
    }
    @Override
    public void sold(int quantity,String email,String add) {
        System.out.println("this book is for showcase only");
    }
}
