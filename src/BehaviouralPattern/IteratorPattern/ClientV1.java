package BehaviouralPattern.IteratorPattern;

public class ClientV1 {
    public static void main(String[] args) {
        BookCollectionsV1 bookCollectionsV1 =new BookCollectionsV1();
        bookCollectionsV1.addBook(new Book("C++ Book"));
        bookCollectionsV1.addBook(new Book("Java Book"));
        bookCollectionsV1.addBook(new Book("Python Book"));

        for(int i = 0; i< bookCollectionsV1.getBooks().size(); i++){
            System.out.println(bookCollectionsV1.getBooks().get(i));
        }
    }
}
