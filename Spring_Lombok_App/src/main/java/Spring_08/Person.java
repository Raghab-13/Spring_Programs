package Spring_08;

//import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

	private Integer pid;
	private String pname;
	private String gender;
	private Integer phno;
	private String doj;
	
}
