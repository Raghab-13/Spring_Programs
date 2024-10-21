package Spring_03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.tcs.dao")
@ComponentScan(basePackages={"com.tcs.dao","Spring_03"})
//@ComponentScan
public class AppCpnfig {
	public AppCpnfig() {
		System.out.println("AppConfig constructor...");
	}
	
	@Bean
	public Engine getEngine()
	{
		Engine eng=new Engine();
		return eng;
	}
}
