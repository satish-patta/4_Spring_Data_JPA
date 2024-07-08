package in.satish.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.satish.entity.Book;

public interface BookRepository extends CrudRepository<Book,Integer> {
  
	//select * from book where book_price >=:price
	public List<Book> findByBookPriceGreaterThanEqual(double price);
	
	//select * from book where book_price <=:price
	public List<Book> findByBookPriceLessThanEqual(double price);
	
	//select * from book where book_name=""
	public List<Book> findByBookName(String bookName);
	
	@Query(value="select * from Book",nativeQuery=true)
	public List<Book> getAllBooks();
	
	@Query("from Book")
	public List<Book> getBooks();
	
}
