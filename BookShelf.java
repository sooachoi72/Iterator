package hw.ch01;

import java.util.Iterator;

public class BookShelf implements Iterable<Book> {
    private Book[] books;
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }

    // [Step 3] 장르 필터 Iterator를 반환하는 메서드 구현
    public Iterator<Book> iteratorByGenre(String genre) {
        return new GenreFilterIterator(this, genre);
    }

    // [Step 3] 출판연도 역순 Iterator를 반환하는 메서드 구현
    public Iterator<Book> iteratorByYear() {
        return new YearReverseIterator(this);
    }
}