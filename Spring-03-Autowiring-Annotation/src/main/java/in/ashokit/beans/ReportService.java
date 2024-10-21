package in.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
	
//	@Autowired
//	@Qualifier("MySql")
	private ReportDao dao;
	
	@Autowired
	@Qualifier("MySql")
	public void setReport(ReportDao dao) {
		this.dao=dao;
	}
	
//	public ReportService(ReportDao dao) {
//		System.out.println("report service constructor");
//		this.dao=dao;
//	}
	
	public void generateReport() {
		dao.getData();
		System.out.println("Report Generated");
	}

}
