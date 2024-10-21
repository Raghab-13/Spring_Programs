package in.ashokit.Xml_Approach;

public class UserDao {
	public void start() {
		System.out.println("getting db connection...");
	}
	
	public void closed() {
		System.out.println("closing db connection....");
	}
	
	public void getdata() {
		System.out.println("getting data from db...");
	}
}
