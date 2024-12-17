package in.ashokit.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.binding.Student;
import in.ashokit.entity.StudentEntity;
import in.ashokit.repo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo repo;
	
	public boolean saveStudent(Student student) {
		System.out.println(student);
		
		StudentEntity entity=new StudentEntity();
		
		//binding object copy into entity object
		BeanUtils.copyProperties(student, entity);
		entity.setTimings(Arrays.toString(student.getTimings()));
		System.out.println(entity);
		repo.save(entity);
		return true;
	}
	
	public List<String> getCourse(){
		return Arrays.asList("java","python","AWS","Jsp");
	}
	
	public List<String> getTimings(){
		return Arrays.asList("Mrng" , "Afternoon" ,"Evening");
	}
}
