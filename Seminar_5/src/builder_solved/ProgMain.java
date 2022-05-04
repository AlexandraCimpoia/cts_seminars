package builder_solved;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		User u1=new User("diana@gmail.com","diana@gmail.com","diana", "b","bucharest");
//		User u2=new User("diana@gmail.com","diana@gmail.com","diana", "b","0740123456");
		
		User u= new User.UserBuilder("anca@gmail.com","anca@gmail.com","anca", "b").address("Bucharest").build();
		User u2= new User.UserBuilder("anca@gmail.com","anca@gmail.com","anca", "b").phone("0740123456").build();

	}

}
