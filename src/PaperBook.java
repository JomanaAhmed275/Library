public class PaperBook extends Book {
    private int quantity;
    public  PaperBook(String title, String isbn,int year,double price,int quantity) {
        super(title, isbn, year, price);
        this.quantity = quantity;
    }
    public int quantity() {
        return quantity;
    }
    public void sale(int amount) {
        this.quantity -= amount;
    }
    @Override
    public boolean is_available() {
        return quantity > 0;
    }
    @Override
    public void  send(String email,String add) {
        System.out.println("sending paper book "+title+" to "+add);
    }
    @Override
    public void sold(int quantity,String email,String add) {
       if(this.quantity <= quantity) {
           System.out.println("not enough quantity"+title);
           return;
       }
       this.quantity -= quantity;
        send(email,add);
        System.out.println("Refound:"+price+"EGP");
    }
}
