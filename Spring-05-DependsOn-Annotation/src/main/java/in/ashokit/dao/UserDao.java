package in.ashokit.dao;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component("dao")
public class UserDao implements InitializingBean{
	
	@Override
	public void afterPropertiesSet() throws Exception{
		System.out.println("get data ffrom db");
		System.out.println("store date into redis");
	}
}
