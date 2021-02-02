package info.kinhho.karaoke.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.kinhho.karaoke.entity.Product;
import info.kinhho.karaoke.entity.Supplier;
import info.kinhho.karaoke.repository.ProducerRepository;


@Service
public class ProducerService {
	
	@Autowired
	private ProducerRepository producerRepository;
	
	public void createSeedData() {
		
		Supplier producer1 = new Supplier("Coca cola", "01213551223", "1 Địa chỉ nào đó mà nó cũng dài dài như vầy nè");
		Supplier producer2 = new Supplier("Pepsi", "01213551223", "1 Địa chỉ nào đó mà nó cũng dài dài như vầy nè");
		Supplier producer3 = new Supplier("Mirinda", "01213551223", "1 Địa chỉ nào đó mà nó cũng dài dài như vầy nè");
		Supplier producer4 = new Supplier("Tân Hiệp Phát", "01213551223", "1 Địa chỉ nào đó mà nó cũng dài dài như vầy nè");
		Supplier producer5 = new Supplier("Giải khát việt nam", "01213551223", "1 Địa chỉ nào đó mà nó cũng dài dài như vầy nè");
		Supplier producer6 = new Supplier("Lavie", "01213551223", "1 Địa chỉ nào đó mà nó cũng dài dài như vầy nè");
		Supplier producer7 = new Supplier("Red Bull", "01213551223", "1 Địa chỉ nào đó mà nó cũng dài dài như vầy nè");
			
		Product food1 = new Product("Food 1","Food", 20, "Cái", 20000);
		Product food2 = new Product("Food 2","Food", 20, "Cái", 20000);
		Product food3 = new Product("Food 3","Food", 20, "Cái", 20000);
		Product food4 = new Product("Food 4","Food", 20, "Cái", 20000);
		Product food5 = new Product("Food 5","Food", 20, "Cái", 20000);
		Product food6 = new Product("Food 6","Food", 20, "Cái", 20000);
		Product food7 = new Product("Food 7","Food", 20, "Cái", 20000);
		Product food8 = new Product("Food 8","Food", 20, "Cái", 20000);
		Product food9 = new Product("Food 9","Food", 20, "Cái", 20000);
		
		Product drink1 = new Product("Drink 1","Drink", 20, "Chai", 20000);
		Product drink2 = new Product("Drink 2","Drink", 20, "Chai", 20000);
		Product drink3 = new Product("Drink 3","Drink", 20, "Chai", 20000);
		Product drink4 = new Product("Drink 4","Drink", 20, "Chai", 20000);
		Product drink5 = new Product("Drink 5","Drink", 20, "Chai", 20000);
		Product drink6 = new Product("Drink 6","Drink", 20, "Chai", 20000);
		Product drink7 = new Product("Drink 7","Drink", 20, "Chai", 20000);
		Product drink8 = new Product("Drink 8","Drink", 20, "Chai", 20000);
		Product drink9 = new Product("Drink 9","Drink", 20, "Chai", 20000);
		
		Product food11 = new Product("Food 11","Food", 20, "Cái", 20000);
		Product food12 = new Product("Food 12","Food", 20, "Cái", 20000);
		Product food13 = new Product("Food 13","Food", 20, "Cái", 20000);
		Product food14 = new Product("Food 14","Food", 20, "Cái", 20000);
		Product food15 = new Product("Food 15","Food", 20, "Cái", 20000);
		Product food16 = new Product("Food 16","Food", 20, "Cái", 20000);
		Product food17 = new Product("Food 17","Food", 20, "Cái", 20000);
		Product food18 = new Product("Food 18","Food", 20, "Cái", 20000);
		Product food19 = new Product("Food 19","Food", 20, "Cái", 20000);
	 	
		Product drink11 = new Product("Drink 11","Drink", 20, "Chai", 20000);
		Product drink12 = new Product("Drink 12","Drink", 20, "Chai", 20000);
		Product drink13 = new Product("Drink 13","Drink", 20, "Chai", 20000);
		Product drink14 = new Product("Drink 14","Drink", 20, "Chai", 20000);
		Product drink15 = new Product("Drink 15","Drink", 20, "Chai", 20000);
		Product drink16 = new Product("Drink 16","Drink", 20, "Chai", 20000);
		Product drink17 = new Product("Drink 17","Drink", 20, "Chai", 20000);
		Product drink18 = new Product("Drink 18","Drink", 20, "Chai", 20000);
		Product drink19 = new Product("Drink 19","Drink", 20, "Chai", 20000);
		
		Product food21 = new Product("Food 21","Food", 20, "Cái", 20000);
		Product food22 = new Product("Food 22","Food", 20, "Cái", 20000);
		Product food23 = new Product("Food 23","Food", 20, "Cái", 20000);
		Product food24 = new Product("Food 24","Food", 20, "Cái", 20000);
		Product food25 = new Product("Food 25","Food", 20, "Cái", 20000);
		Product food26 = new Product("Food 26","Food", 20, "Cái", 20000);
		Product food27 = new Product("Food 27","Food", 20, "Cái", 20000);
		Product food28 = new Product("Food 28","Food", 20, "Cái", 20000);
		Product food29 = new Product("Food 29","Food", 20, "Cái", 20000);
		
		Product drink21 = new Product("Drink 21","Drink", 20, "Chai", 20000);
		Product drink22 = new Product("Drink 22","Drink", 20, "Chai", 20000);
		Product drink23 = new Product("Drink 23","Drink", 20, "Chai", 20000);
		Product drink24 = new Product("Drink 24","Drink", 20, "Chai", 20000);
		Product drink25 = new Product("Drink 25","Drink", 20, "Chai", 20000);
		Product drink26 = new Product("Drink 26","Drink", 20, "Chai", 20000);
		Product drink27 = new Product("Drink 27","Drink", 20, "Chai", 20000);
		Product drink28 = new Product("Drink 28","Drink", 20, "Chai", 20000);
		Product drink29 = new Product("Drink 29","Drink", 20, "Chai", 20000);
		
		Product food31 = new Product("Food 31","Food", 20, "Cái", 20000);
		Product food32 = new Product("Food 32","Food", 20, "Cái", 20000);
		Product food33 = new Product("Food 33","Food", 20, "Cái", 20000);
		Product food34 = new Product("Food 34","Food", 20, "Cái", 20000);
		Product food35 = new Product("Food 35","Food", 20, "Cái", 20000);
		Product food36 = new Product("Food 36","Food", 20, "Cái", 20000);
		Product food37 = new Product("Food 37","Food", 20, "Cái", 20000);
		Product food38 = new Product("Food 38","Food", 20, "Cái", 20000);
		Product food39 = new Product("Food 39","Food", 20, "Cái", 20000);
		
		Product drink31 = new Product("Drink 31","Drink", 20, "Chai", 20000);
		Product drink32 = new Product("Drink 32","Drink", 20, "Chai", 20000);
		Product drink33 = new Product("Drink 33","Drink", 20, "Chai", 20000);
		Product drink34 = new Product("Drink 34","Drink", 20, "Chai", 20000);
		Product drink35 = new Product("Drink 35","Drink", 20, "Chai", 20000);
		Product drink36 = new Product("Drink 36","Drink", 20, "Chai", 20000);
		Product drink37 = new Product("Drink 37","Drink", 20, "Chai", 20000);
		Product drink38 = new Product("Drink 38","Drink", 20, "Chai", 20000);
		Product drink39 = new Product("Drink 39","Drink", 20, "Chai", 20000);
		
		Product food41 = new Product("Food 41","Food", 20, "Cái", 20000);
		Product food42 = new Product("Food 42","Food", 20, "Cái", 20000);
		Product food43 = new Product("Food 43","Food", 20, "Cái", 20000);
		Product food44 = new Product("Food 44","Food", 20, "Cái", 20000);
		Product food45 = new Product("Food 45","Food", 20, "Cái", 20000);
		Product food46 = new Product("Food 46","Food", 20, "Cái", 20000);
		Product food47 = new Product("Food 47","Food", 20, "Cái", 20000);
		Product food48 = new Product("Food 48","Food", 20, "Cái", 20000);
		Product food49 = new Product("Food 49","Food", 20, "Cái", 20000);
	 	
		Product drink41 = new Product("Drink 41","Drink", 20, "Chai", 20000);
		Product drink42 = new Product("Drink 42","Drink", 20, "Chai", 20000);
		Product drink43 = new Product("Drink 43","Drink", 20, "Chai", 20000);
		Product drink44 = new Product("Drink 44","Drink", 20, "Chai", 20000);
		Product drink45 = new Product("Drink 45","Drink", 20, "Chai", 20000);
		Product drink46 = new Product("Drink 46","Drink", 20, "Chai", 20000);
		Product drink47 = new Product("Drink 47","Drink", 20, "Chai", 20000);
		Product drink48 = new Product("Drink 48","Drink", 20, "Chai", 20000);
		Product drink49 = new Product("Drink 49","Drink", 20, "Chai", 20000);
		
		Product food51 = new Product("Food 51","Food", 20, "Cái", 20000);
		Product food52 = new Product("Food 52","Food", 20, "Cái", 20000);
		Product food53 = new Product("Food 53","Food", 20, "Cái", 20000);
		Product food54 = new Product("Food 54","Food", 20, "Cái", 20000);
		Product food55 = new Product("Food 55","Food", 20, "Cái", 20000);
		Product food56 = new Product("Food 56","Food", 20, "Cái", 20000);
		Product food57 = new Product("Food 57","Food", 20, "Cái", 20000);
		Product food58 = new Product("Food 58","Food", 20, "Cái", 20000);
		Product food59 = new Product("Food 59","Food", 20, "Cái", 20000);
	
		Product drink51 = new Product("Drink 51","Drink", 20, "Chai", 20000);
		Product drink52 = new Product("Drink 52","Drink", 20, "Chai", 20000);
		Product drink53 = new Product("Drink 53","Drink", 20, "Chai", 20000);
		Product drink54 = new Product("Drink 54","Drink", 20, "Chai", 20000);
		Product drink55 = new Product("Drink 55","Drink", 20, "Chai", 20000);
		Product drink56 = new Product("Drink 56","Drink", 20, "Chai", 20000);
		Product drink57 = new Product("Drink 57","Drink", 20, "Chai", 20000);
		Product drink58 = new Product("Drink 58","Drink", 20, "Chai", 20000);
		Product drink59 = new Product("Drink 59","Drink", 20, "Chai", 20000);
	 	
		Product food61 = new Product("Food 61","Food", 20, "Cái", 20000);
		Product food62 = new Product("Food 62","Food", 20, "Cái", 20000);
		Product food63 = new Product("Food 63","Food", 20, "Cái", 20000);
		Product food64 = new Product("Food 64","Food", 20, "Cái", 20000);
		Product food65 = new Product("Food 65","Food", 20, "Cái", 20000);
		Product food66 = new Product("Food 66","Food", 20, "Cái", 20000);
		Product food67 = new Product("Food 67","Food", 20, "Cái", 20000);
		Product food68 = new Product("Food 68","Food", 20, "Cái", 20000);
		Product food69 = new Product("Food 69","Food", 20, "Cái", 20000);
		
		Product drink61 = new Product("Drink 61","Drink", 20, "Chai", 20000);
		Product drink62 = new Product("Drink 62","Drink", 20, "Chai", 20000);
		Product drink63 = new Product("Drink 63","Drink", 20, "Chai", 20000);
		Product drink64 = new Product("Drink 64","Drink", 20, "Chai", 20000);
		Product drink65 = new Product("Drink 65","Drink", 20, "Chai", 20000);
		Product drink66 = new Product("Drink 66","Drink", 20, "Chai", 20000);
		Product drink67 = new Product("Drink 67","Drink", 20, "Chai", 20000);
		Product drink68 = new Product("Drink 68","Drink", 20, "Chai", 20000);
		Product drink69 = new Product("Drink 69","Drink", 20, "Chai", 20000);
		
		List<Product> foods1 = new ArrayList<>();
		List<Product> foods2 = new ArrayList<>();
		List<Product> foods3 = new ArrayList<>();
		List<Product> foods4 = new ArrayList<>();
		List<Product> foods5 = new ArrayList<>();
		List<Product> foods6 = new ArrayList<>();
		List<Product> foods7 = new ArrayList<>();
		
		Collections.addAll(foods1, food1,  food2,  food3,  food4,  food5,  food6,  food7,  food8,  food9,  drink1,  drink2,  drink3,  drink4,  drink5,  drink6,  drink7,  drink8,  drink9);
		Collections.addAll(foods2, food11, food12, food13, food14, food15, food16, food17, food18, food19, drink11, drink12, drink13, drink14, drink15, drink16, drink17, drink18, drink19);
		Collections.addAll(foods3, food21, food22, food23, food24, food25, food26, food27, food28, food29, drink21, drink22, drink23, drink24, drink25, drink26, drink27, drink28, drink29);
		Collections.addAll(foods4, food31, food32, food33, food34, food35, food36, food37, food38, food39, drink31, drink32, drink33, drink34, drink35, drink36, drink37, drink38, drink39);
		Collections.addAll(foods5, food41, food42, food43, food44, food45, food46, food47, food48, food49, drink41, drink42, drink43, drink44, drink45, drink46, drink47, drink48, drink49);
		Collections.addAll(foods6, food51, food52, food53, food54, food55, food56, food57, food58, food59, drink51, drink52, drink53, drink54, drink55, drink56, drink57, drink58, drink59);
		Collections.addAll(foods7, food61, food62, food63, food64, food65, food66, food67, food68, food69, drink61, drink62, drink63, drink64, drink65, drink66, drink67, drink68, drink69);
		
		producer1.setFoods(foods1);
		producer2.setFoods(foods2);
		producer3.setFoods(foods3);
		producer4.setFoods(foods4);
		producer5.setFoods(foods5);
		producer6.setFoods(foods6);
		producer7.setFoods(foods7);
		
		producerRepository.save(producer1);
		producerRepository.save(producer2);
		producerRepository.save(producer3);
		producerRepository.save(producer4);
		producerRepository.save(producer5);
		producerRepository.save(producer6);
		producerRepository.save(producer7);
		
	}

	public Iterable<Supplier> get() {
		
		return producerRepository.findAll();
	}
	
	public Supplier get(String id) {
		
		return producerRepository.findById(Integer.parseInt(id)).get();
	}
	public void save(Supplier producer) {
		this.producerRepository.save(producer);
	}
	
	public void update(Supplier producer) {
		this.producerRepository.deleteById(producer.getId());
		this.producerRepository.save(producer);
	}
	
	public void delete(String id) {
		this.producerRepository.deleteById(Integer.parseInt(id));
	}
}
