package BehaviouralPattern.IteratorPattern;

public class ClientV2 {
    public static void main(String[] args) {
        BookCollectionV2 bookCollections =new BookCollectionV2();
        bookCollections.addBook(new Book("C++ Book"));
        bookCollections.addBook(new Book("Java Book"));
        bookCollections.addBook(new Book("Python Book"));

        Iterator<Book> iterator =bookCollections.createIterator();
        while (iterator.hasNext()){
            Book book=iterator.next();
            System.out.println("Book Title"+ book.getTitle());
        }
    }
}
