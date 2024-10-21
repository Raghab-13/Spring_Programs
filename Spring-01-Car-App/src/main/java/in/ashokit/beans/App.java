package in.ashokit.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("Beans.xml");
		Car car = ctxt.getBean(Car.class);
		car.drive();
	}

}
