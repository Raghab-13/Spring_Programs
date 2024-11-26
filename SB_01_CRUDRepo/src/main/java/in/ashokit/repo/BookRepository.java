package in.ashokit.repo;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {
	
	//..........findBy methods..........
	//...select * from book where book_price > price...
	//public List<Book> findByBookPriceGreaterThan(Double price);
	
	
	//............native sql queries...............
	/*
	 * @Query(value="select * from book" ,nativeQuery=true) 
	 * public List<Book> getAllBooks();
	 */
	
	//..............hql queries..........
	
	/*
	 * @Query("from Book") public List<Book> getBooks();
	 */
	
	//another hql queries example
	
	@Query("select bookName from Book")
	public List<String> getBookNames();
}
