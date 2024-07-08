package in.satish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.satish.entity.Book;
import in.satish.repository.BookRepository;

@SpringBootApplication
public class DataJpaApplication {

	public static void main(String[] args) {
	    ConfigurableApplicationContext ctxt=
				SpringApplication.run(DataJpaApplication.class, args);
		BookRepository repo = ctxt.getBean(BookRepository.class);
		
		
//		Optional<Book> findById = repo.findById(102);
//		if(findById.isPresent()) {
//			System.out.println(findById.get());
//		}
//	     System.out.println(repo.findById(202));
		
//		Iterable<Book> findAllById = repo.findAllById(Arrays.asList(101,102,103));
//		for(Book b: findAllById) {
//			System.out.println(b);
//		}
		
//		Iterable<Book> findAll = repo.findAll();
//		for(Book b: findAll) {
//			Double bookPrice =(Double)b.getBookPrice();
//			if(bookPrice>=2500)
//			System.out.println(b);
//		}
		
//		 if(repo.existsById(105)) {
//			 repo.deleteById(105);
//		 } else {
//			 System.out.println("Record Nof Found...");
//		 }
		
//		List<Book> bookPriceGreater = repo.findByBookPriceGreaterThanEqual(3500);
//		for(Book b : bookPriceGreater) {
//			System.out.println(b);
//		}
//		
//		List<Book> bookPriceLesser = repo.findByBookPriceGreaterThanEqual(3500);
//		for(Book b : bookPriceLesser) {
//			System.out.println(b);
//		}
//		
//		List<Book> bookNames = repo.findByBookName("satish");
//		for(Book b : bookNames) {
//			System.out.println(b);
//		}
		
		List<Book> books = repo.getBooks();
		for(Book b: books) {
			System.out.println(b);
		}
		
		
		
	}

}
