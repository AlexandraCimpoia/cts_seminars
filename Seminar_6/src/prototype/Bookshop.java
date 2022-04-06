package prototype;

import java.util.ArrayList;

public class Bookshop implements Cloneable {

	private String name;
	private ArrayList<Book> books = new ArrayList<Book>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

	public Bookshop(String name, ArrayList<Book> books) {
		super();
		this.name = name;
		this.books = books;
	}

	public Bookshop() {
		// this.books = new ArrayList<Book>;
	}

	@Override
	public String toString() {
		return "Bookshop [name=" + name + ", books=" + books + "]";
	}

	public static Bookshop loadDataFromDB(String name) {
		Bookshop bookshop = new Bookshop();
		bookshop.name = name;
		Book book = null;
		for (int i = 0; i < 10; i++) {
			book = new Book(name + "-" + i, "diana", i * 100);
			bookshop.books.add(book);
		}
		return bookshop;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Bookshop copy = new Bookshop();
		copy.name = this.name;
		copy.books = (ArrayList<Book>) this.books.clone(); //deep copy
		return copy;
		//return super.clone();
	}

}