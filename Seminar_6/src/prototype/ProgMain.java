package prototype;

public class ProgMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		Bookshop carturesti = Bookshop.loadDataFromDB("carturesti");
		System.out.println(carturesti);

//		System.out.println("SHALLOW COPY");
//		Bookshop diverta = carturesti;
//		diverta.getBooks().remove(3);
//		System.out.println(carturesti);
		
		System.out.println("DEEP COPY");
		Bookshop diverta = (Bookshop)carturesti.clone();
		diverta.getBooks().remove(3);
		System.out.println(carturesti);

	}

}
