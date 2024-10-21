package in.ashokit.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

//@Repository("dao")
@Repository("Oracle")
//@Primary
public class OracleDBReport implements ReportDao {

	@Override
	public void getData() {
		// TODO Auto-generated method stub
		System.out.println("getting data from oracle db");
	}

}
