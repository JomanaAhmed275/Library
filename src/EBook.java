public class EBook extends Book{
    private String filetype;
    public EBook(String title, String isbn, double price,int year,String filetype) {
        super(title, isbn, year, price);
        this.filetype = filetype;
    }
    public String getFiletype() {
        return filetype;
    }
    @Override
    public boolean is_available() {
        return true;
    }
    @Override
    public void  send(String email,String add) {
        System.out.println("sending book "+title+" to "+email+" as "+filetype);
    }
    @Override
    public void sold(int quantity,String email,String add) {
        send(email,add);
        System.out.println("Refound:"+price+"EGP");
    }

}
