package in.ashokit;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Account;
import in.ashokit.entity.AccountPK;
import in.ashokit.repo.AccountRepo;

@SpringBootApplication
public class Sb04CompostiePkJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Sb04CompostiePkJpaApplication.class, args);
		AccountRepo repo = ctxt.getBean(AccountRepo.class);
		
		AccountPK apk=new AccountPK();
		apk.setAccNum((long) 1231393);
		apk.setAccType("Savings");
//		
//		Account acc=new Account();
//		acc.setAcctHolder("Edward");
//		acc.setBranch("Pattamundai");
//		acc.setAccountPK(apk);
//		
//		repo.save(acc);
//		System.out.println("successfull");
		
		Optional<Account> findById = repo.findById(apk);
		if(findById.isPresent()) {
			System.out.println(findById.get());
		}
		
	}

}
