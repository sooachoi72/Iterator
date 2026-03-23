package hw.ch01;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class YearReverseIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private int index;

    public YearReverseIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        // 마지막 인덱스부터 시작 (역순 순회를 위해)
        this.index = bookShelf.getLength() - 1;
    }

    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return bookShelf.getBookAt(index--);
    }
}