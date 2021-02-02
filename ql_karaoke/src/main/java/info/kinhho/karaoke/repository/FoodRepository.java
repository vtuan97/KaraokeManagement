package info.kinhho.karaoke.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import info.kinhho.karaoke.entity.Product;

public interface FoodRepository extends CrudRepository<Product, Integer> {
	
	@Query("SELECT f FROM Food f")
	public Iterable<Product> get();
}
