package in.ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Book;
import in.ashokit.repo.BookRepository;

@SpringBootApplication
public class Sb01CrudRepoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Sb01CrudRepoApplication.class, args);
		
		BookRepository repo=ctxt.getBean(BookRepository.class);
		
		//System.out.println(repo.getClass().getName());
		
		
		/*
		 * Book b1=new Book(); b1.setBookId(106); b1.setBookName("Js");
		 * b1.setBookPrice(1200.00);
		 * 
		 * Book b2=new Book(); b2.setBookId(107); b2.setBookName("C");
		 * b2.setBookPrice(5000.00);
		 */
		 
		/*
		 * List<Book> bookList = new ArrayList<>(); bookList.add(b1); bookList.add(b2);
		 * 
		 * repo.saveAll(bookList);
		 */
		 
		 //repo.saveAll(Arrays.asList(b1,b2));
		 
		 
		 //repo.save(b); 
		 //System.out.println("Record Inserted");
		
		
		/*
		 * boolean existsById = repo.existsById(189);
		 * System.out.println("Record presenece :"+existsById);
		 */
		
		//System.out.println("Total Records :"+repo.count());
		
		/*
		 * This is for retrieve record based on given primary key
		 * 
		 * Optional<Book> findById = repo.findById(101);
		 * if(findByID.isPresent()){
		 * 		System.out.println(findById.get());
		 * }
		 */
		
		//retrieve for multiple primary keys
		/*
		 * Iterable<Book> findAllById = repo.findAllById(Arrays.asList(101,105,107));
		 * 
		 * for(Book b:findAllById) { System.out.println(b); }
		 */
		
		//retrieve all records
		
		/*
		 * Iterable<Book> findAll = repo.findAll(); for(Book b:findAll) {
		 * System.out.println(b); }
		 */
			
		
		//for deleting based on pk
		/*
		 * if(repo.existsById(107)) { 
		 * 	repo.deleteById(107); 
		 * }else {
		 * 	System.out.println("no data found");
		 * }
		 */
		
		
		//using findBy methods
		/*
		 * List<Book> books = repo.findByBookPriceGreaterThan(2500.00); 
		 * for(Book b :books) {
		 *  System.out.println(b);
		 * }
		 */
		
		
		//using native sql queries
		/*
		 * List<Book> allBooks = repo.getAllBooks();
		 * for(Book b:allBooks) {
		 * 	System.out.println(b); 
		 * }
		 */
		
		//using hql queries
		/*
		 * List<Book> books = repo.getBooks(); 
		 * for(Book b:books) {
		 * 	System.out.println(b);
		 * }
		 */
		
		
		List<String> bookNames = repo.getBookNames();
		//bookNames.forEach(System.out::println);
		for(String b:bookNames) {
			System.out.println(b);
		}
	}

}
