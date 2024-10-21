package in.ashokit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ashokit.Annotation_Approach.AppConfig;
import in.ashokit.Annotation_Approach.UserDao3;
//import in.ashokit.Programmatic_Approach.UserDao2;

//import in.ashokit.Xml_Approach.UserDao;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Note-1:- This for Xml Approach......
		
//		ApplicationContext ctxt = new ClassPathXmlApplicationContext("Beans.xml");
//		UserDao dao = ctxt.getBean(UserDao.class);
//		dao.getdata();
		
		//Note-2:-This is For Programmatic Approach......
//		ApplicationContext ctxt = new ClassPathXmlApplicationContext("Beans.xml");
//		UserDao2 dao2 = ctxt.getBean(UserDao2.class);
//		dao2.getData();
		
		
		//Note-3:- This for Annotation Approach.......
		ApplicationContext ctxt = new AnnotationConfigApplicationContext(AppConfig.class);
		UserDao3 dao3 = ctxt.getBean(UserDao3.class);
		dao3.getData();
		
		//for ioc conatainer closing.....
		ConfigurableApplicationContext cctxt=(ConfigurableApplicationContext)ctxt;
		cctxt.close();
	}

}
