package i;

//i - interface segregation

public interface IPrintTask {

	boolean printContent(String content);
	boolean scanContent(String content);
	boolean faxContent(String content);
	boolean printContentExternalDevices(String content);
	boolean authenticateBadge(String content);
}
