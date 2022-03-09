package s.resolved;

public interface IUser {

	public boolean login(String username, String password);
	public boolean register(String username,String email, String password);
}
