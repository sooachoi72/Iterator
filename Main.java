package hw.ch01;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        System.out.println("학번: 20240904 / 이름: 최수아");
        System.out.println("--------------------------------");
        
        // [Step 4-1] 10개의 책 데이터를 담을 수 있도록 크기 지정 및 데이터 추가
        BookShelf bookShelf = new BookShelf(10);
        
        // PDF 테이블 데이터 입력 [cite: 39, 40]
        bookShelf.appendBook(new Book("클린코드", "기술", 2008, 30000));
        bookShelf.appendBook(new Book("해리포터와 마법사의 돌", "소설", 1997, 15000));
        bookShelf.appendBook(new Book("사피엔스", "역사", 2011, 18000));
        bookShelf.appendBook(new Book("이펙티브 자바", "기술", 2018, 36000));
        bookShelf.appendBook(new Book("객체지향의 사실과 오해", "기술", 2015, 20000));
        bookShelf.appendBook(new Book("레미제라블", "소설", 1862, 12000));
        bookShelf.appendBook(new Book("총균쇠", "역사", 1997, 22000));
        bookShelf.appendBook(new Book("리팩터링", "기술", 2018, 34000));
        bookShelf.appendBook(new Book("로마인 이야기", "역사", 1992, 25000));
        bookShelf.appendBook(new Book("어린왕자", "소설", 1943, 9000));

        // 기존 코드와의 호환성 테스트 (Step 1 생성자 오버로딩 확인) [cite: 20]
        System.out.println("----- 기존 방식 순회 -----");
        for (Book book : bookShelf) {
            System.out.println(book.getName());
        }
        System.out.println();

        // [Step 4-2] 장르 필터 Iterator 테스트 ('소설' 장르만 출력) [cite: 41, 42]
        System.out.println("----- 장르 필터 테스트: 소설 -----");
        Iterator<Book> genreIt = bookShelf.iteratorByGenre("소설");
        while (genreIt.hasNext()) {
            Book book = genreIt.next();
            System.out.printf("제목: %s | 장르: %s | 출판년도: %d | 가격: %.1f원%n", 
                book.getName(), book.getGenre(), book.getYear(), book.getPrice());
        }
        System.out.println();

        // [Step 4-3] 출판연도 역순 Iterator 테스트 (최신순 출력) [cite: 43, 44]
        System.out.println("----- 출판연도 역순 테스트 -----");
        Iterator<Book> yearIt = bookShelf.iteratorByYear();
        while (yearIt.hasNext()) {
            Book book = yearIt.next();
            System.out.printf("제목: %s | 장르: %s | 출판년도: %d | 가격: %.1f원%n", 
                book.getName(), book.getGenre(), book.getYear(), book.getPrice());
        }
    }
}
