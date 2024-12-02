package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmployeeRepo;

@SpringBootApplication
public class Sb03GeneratorTimeStampingJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Sb03GeneratorTimeStampingJpaApplication.class, args);
		EmployeeRepo repo = ctxt.getBean(EmployeeRepo.class);
		
		Employee e=new Employee();
		
		e.setEName("Subha");
		e.setDept("Admin");
		e.setEGender("Male");
		e.setESalary(32000.00);
		
		repo.save(e);
		System.out.println("successfully saved");
		
		
	}

}
