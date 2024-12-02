package in.ashokit.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	@Id
	@GeneratedValue
	private Integer eId;
	private String eName;
	private Double eSalary;
	private String eGender;
	private String dept;
	
	@CreationTimestamp
	@Column(name="date_created" , updatable=false)
	private LocalDate dateCreated;
	
	@UpdateTimestamp
	@Column(name="last_updated" , insertable=false)
	private LocalDate lastUpdated;
}
