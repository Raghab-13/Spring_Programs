package in.ashokit.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	public List<String> getCourse(){
		return Arrays.asList("java","python","AWS","Jsp");
	}
	
	public List<String> getTimings(){
		return Arrays.asList("Mrng" , "Afternoon" ,"Evening");
	}
}
