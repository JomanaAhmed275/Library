public abstract class Book {
    protected String title;
    protected String isbn;
    protected int    year;
    protected double  price;
    public Book(String title, String ISbn, int year, double price) {
        this.title = title;
        this.isbn = ISbn;
        this.year = year;
        this.price = price;
    }

    public String ISbn() {
        return isbn;
    }
    public int  year() {
        return year;
    }
    public double price() {
        return price;
    }
    public String title() {
        return title;
    }

    public abstract boolean is_available() ;
    public abstract void send(String email, String add) ;
    public void  sold(int quantity,String email,String add) {
        System.out.println("sold:"+title);
        send(email,add);
        System.out.println("Refound:"+price+"EGP");
    }

}
