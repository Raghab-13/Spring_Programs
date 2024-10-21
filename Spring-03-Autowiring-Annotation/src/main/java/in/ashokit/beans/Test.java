package in.ashokit.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctxt= new AnnotationConfigApplicationContext(AppConfig.class);
		ReportService service = ctxt.getBean(ReportService.class);
		service.generateReport();
	}

}
