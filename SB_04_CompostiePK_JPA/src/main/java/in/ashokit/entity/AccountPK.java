package in.ashokit.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class AccountPK {
	
	private Long accNum;
	private String accType;
}
