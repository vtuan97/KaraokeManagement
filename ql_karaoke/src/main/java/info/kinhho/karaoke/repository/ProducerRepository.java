package info.kinhho.karaoke.repository;

import org.springframework.data.repository.CrudRepository;

import info.kinhho.karaoke.entity.Supplier;

public interface ProducerRepository extends CrudRepository<Supplier, Integer> {
	
	Supplier findByName(String name);
}
