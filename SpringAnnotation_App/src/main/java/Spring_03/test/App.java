package Spring_03.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Spring_03.AppCpnfig;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctxt=new AnnotationConfigApplicationContext(AppCpnfig.class);
	}

}
