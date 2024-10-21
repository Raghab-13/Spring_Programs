package in.ashokit.beans;

import org.springframework.stereotype.Repository;

@Repository("MySql")
public class MySqlDBReport implements ReportDao {

	@Override
	public void getData() {
		// TODO Auto-generated method stub
		System.out.println("getting data from mysql db---");
	}

}
