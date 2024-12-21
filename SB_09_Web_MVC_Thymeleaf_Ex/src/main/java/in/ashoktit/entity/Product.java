package in.ashoktit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class Product {
	
	@Id
	@GeneratedValue
	private Integer pid;
	
	@Size(min=3,max=15,message="Name should be 3 to 15 charcters")
	@NotBlank
	private String name;
	
	@NotNull
	@Positive
	private Double price;
	
	@NotNull
	@Positive
	private Integer qty;
}
