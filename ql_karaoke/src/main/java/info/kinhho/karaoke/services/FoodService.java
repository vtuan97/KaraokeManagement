package info.kinhho.karaoke.services;


import org.springframework.stereotype.Service;

import info.kinhho.karaoke.entity.Product;
import info.kinhho.karaoke.entity.Supplier;
import info.kinhho.karaoke.repository.FoodRepository;
import info.kinhho.karaoke.repository.ProducerRepository;


@Service
public class FoodService {
	
	private FoodRepository foodRepository;
	private ProducerRepository producerRepository;
	
	public FoodService(FoodRepository foodRepository, ProducerRepository producerRepository) {
		super();
		this.foodRepository = foodRepository;
		this.producerRepository = producerRepository;
	}

	public Iterable<Product> get() {
		System.out.println("access!");
		return foodRepository.findAll();
	}
	
	public Product get(String id) {
		
		return foodRepository.findById(Integer.parseInt(id)).get();
	}
	public void save(Product food) {
		
		Supplier producer =  this.producerRepository.findById(food.getProducer().getId()).get();
		food.setProducer(producer);
		
		this.foodRepository.save(food);
	}
	
	public void update(Product food) {
		
		Supplier producer =  this.producerRepository.findById(food.getProducer().getId()).get();
		food.setProducer(producer);
		
		this.foodRepository.deleteById(food.getId());
		this.foodRepository.save(food);
	}
	
	public void delete(String id) {
		this.foodRepository.deleteById(Integer.parseInt(id));
	}
	
}
