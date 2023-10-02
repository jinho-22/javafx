package books;

public class Book {
	
//	책이름(bookName), 작가(author)
	
//	생성자는 2개를 만드는데
//	기본생성자
//	String bookName, String author 2개의 파라미터를 가지는 생성자
	
//	getter와 setter 생성
	
//	showBookInfo 메서드를 생성
//	책이름, 작가
	
	// 필드
	private String bookName;
	private String author;
	
	// 생성자
	public Book( ) {}
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	// getter와 setter 생성
	public String getBookName() {
		return bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	// showBookInfo 메소드  
	public void showBookInfo() {
		System.out.println(bookName+ " " + author);
	}
}
