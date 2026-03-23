package hw.ch01;

public class Book {
    private String name;
    // [Step 1] 필드 추가 
    private String genre; // 장르: "소설", "과학", "역사", "기술" 등 
    private int year;     // 출판연도 (예: 2008) 
    private double price; // 가격 (단위: 원, 예: 30000.0) 

    // [Step 1] 기존 생성자 유지 (Main.java의 기존 코드 수정 없이 컴파일되도록 함) 
    public Book(String name) {
        this.name = name;
    }

    // [Step 1] 새 필드를 받는 생성자 오버로딩 추가 
    public Book(String name, String genre, int year, double price) {
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.price = price;
    }

    // [Step 1] Getter 구현 (Setter는 불변 객체 유지를 위해 만들지 않음) 
    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }
}