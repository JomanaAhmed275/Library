public class Main {
    public static void main(String[] args) {

        BookStore store = new BookStore(100);


        store.add_book(new PaperBook("java", "P001", 2018, 250, 5));
        store.add_book(new EBook("Clean Code", "P002", 150, 2015, "PDF"));
        store.add_book(new ShowBook("C++", "A001", 2000, 250));
        store.add_book(new ShowBook("Python", "B001", 2020, 250));
        store.add_book(new PaperBook("OOP", "P004", 2010, 300, 2));
        store.add_book(new EBook("PHP", "A002", 180, 2022, "exe"));


        store.remove_book(12, 2024);

        store.buy_book("P001", 2, "gomana@gmail.com", "Cairo");
        store.buy_book("B001", 2, "gomana@gmail.com", "Cairo");

        store.buy_book("A002", 1, "gomana@gmail.com", "Tala");

        store.buy_book("A001", 1, "gomana@gmail.com", "Tanta");

        store.buy_book("X999", 1, "gomana@gmail.com", "Giza");
    }
}