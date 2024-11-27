package in.ashokit;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmployeeRepo;

@SpringBootApplication
public class Sb02JpaRepoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Sb02JpaRepoApplication.class, args);
		EmployeeRepo repo=ctxt.getBean(EmployeeRepo.class);
		//System.out.println(repo.getClass().getName());
		
		/*
		 * Employee e1=new Employee(101,"John",5000.00,"Male","Sales"); Employee e2=new
		 * Employee(102,"Jian",12000.00,"Male","Sales"); Employee e3=new
		 * Employee(103,"Marry",8000.00,"Female","Sales"); Employee e4=new
		 * Employee(104,"Robert",14000.00,"Male","Sales"); Employee e5=new
		 * Employee(105,"Kirti",3000.00,"Female","Sales"); Employee e6=new
		 * Employee(106,"Thor",15000.00,"Male","Sales");
		 * 
		 * repo.saveAll(Arrays.asList(e1,e2,e3,e4,e5,e6));
		 * 
		 * System.out.println("Record Inserted");
		 */
		
		
		//sorting purpose.....
		/*
		 * Sort s = Sort.by("empSalary","empName").descending(); List<Employee> emps =
		 * repo.findAll(s); emps.forEach(System.out::println);
		 */
		
		//pagination purpose.....
		/*
		 * int pageNo=3; PageRequest page = PageRequest.of(pageNo-1,3); Page<Employee>
		 * findAll = repo.findAll(page); List<Employee> emps = findAll.getContent();
		 * emps.forEach(System.out::println);
		 */
		
		//Query By Example.....
		/*
		 * Employee emp=new Employee();
		 * emp.setEmpGender("Female");
		 * 
		 * Example<Employee> exmp = Example.of(emp);
		 * List<Employee> emps =repo.findAll(exmp); 
		 * emps.forEach(System.out::println);
		 */
		
		//custom query.....
		/*
		 * List<Employee> emps = repo.getEmps(); for(Employee e:emps) {
		 * System.out.println(e); }
		 */
		
		
		
		//....update record in table by using custom queries
		/*
		 * repo.updateEmps(101,"raja"); 
		 * System.out.println("successfully Updated");
		 */
		
		
		
		//...delete record in table by using custom queries
		/*
		 * repo.deleteEmp(106); 
		 * System.out.println("successfully deleted");
		 */
		
		
		//...insert into employee table
		
		repo.insertData(106,"Admin","Male","Raghab",50000.00);
		System.out.println("successfully inserted");
		
	}

}
