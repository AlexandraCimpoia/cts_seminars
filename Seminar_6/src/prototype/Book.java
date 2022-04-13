package prototype;

public class Book implements Cloneable{
	private String title;
	private String author;
	private int price;

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "\n Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}

	//works fine for primitives
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	

}