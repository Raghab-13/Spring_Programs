package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import in.ashokit.entity.Employee;
import jakarta.transaction.Transactional;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
	
	/*
	 * @Query(value="select * from employee",nativeQuery=true) 
	 * public List<Employee> getEmps();
	 */
	
	//.........update employee table........
	
	/*@Modifying
	@Transactional
	@Query(value = "UPDATE employee SET emp_name = ?2 WHERE emp_id = ?1", nativeQuery = true)
	int updateEmps(int emp_id, String emp_name);*/
	
	
	//delete one record from employee table.....
	
	/* @Modifying
	 * @Transactional
	 * @Query(value="DELETE FROM employee WHERE emp_id=?",nativeQuery=true)
	 * int deleteEmp(int id);
	 */
	
	
	//insert data into employee table.....
	
	@Modifying
	@Transactional
	@Query(value="insert into employee value(?,?,?,?,?)",nativeQuery=true)
	int insertData(int id,String dept,String gender,String name,Double salary);
	

}
