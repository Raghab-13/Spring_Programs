package in.ashokit.Annotation_Approach;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class UserDao3 {
	
	@PostConstruct
	public void start() {
		System.out.println("start the  method...");
	}
	
	@PreDestroy
	public void closed() {
		System.out.println("Closed the method....");
	}
	
	public void getData() {
		System.out.println("getting data from db");
	}
}
