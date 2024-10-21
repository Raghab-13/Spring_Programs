package in.ashokit.Pragrammatic_Approach;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UserDao2 implements InitializingBean,DisposableBean{
	
	public void afterPropertiesSet() {
		System.out.println("init method....");
	}
	
	public void destroy() {
		System.out.println("destroy method....");
	}
	
	public void getData() {
		System.out.println("getting data from db..");
	}
}
