package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Book implements Comparable<Book>
{
	private int bookId;
	private String bookName;
	public Book(int bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}
	public Book() {
		super();
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + "]";
	}
	@Override
	public int compareTo(Book book) {
		int bookId=book.getBookId();
		//return this.bookId-bookId;
		return bookId-this.bookId;
		
	}
	
}

public class SortingDemo1 {

	public static void main(String[] args) {
		/*List<String> colorList=new ArrayList<String>();
		colorList.add("Blue");
		colorList.add("Yellow");
		colorList.add("Green");
		System.out.println(colorList);
		Collections.sort(colorList);
		System.out.println(colorList);*/
		
		Book b1=new Book(1,"The Kite Runner");
		Book b3=new Book(3, "The White Tiger");
		Book b2=new Book(2, "The Alchemist");
		List<Book> bookList=new ArrayList<Book>();
		bookList.add(b1);
		bookList.add(b3);
		bookList.add(b2);
		System.out.println(bookList);
		Collections.sort(bookList);
		System.out.println(bookList);
	}

}
