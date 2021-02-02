package info.kinhho.karaoke.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class ProductEntity extends CommonEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name="name")
	private String name;
	
	@Column(name="quanlity")
	private int quanlity;
	
	@Column(name="unit")
	private String unit;
	
	@Column(name="price")
	private int price;
	
	@Column(name="type")
	private String type;	
	

	@OneToMany(mappedBy = "food")
	private List<DetailFood> detail_foods;
	
	public Product() {
		super();
		producer = new Supplier();
	}

	public ProductEntity(String name, String type, int quanlity, String unit, int price) {

		this.name = name;
		this.price = price;
		this.quanlity = quanlity;
		this.unit = unit;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuanlity() {
		return quanlity;
	}

	public void setQuanlity(int quanlity) {
		this.quanlity = quanlity;
	}
	
	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Supplier getProducer() {
		return producer;
	}

	public void setProducer(Supplier producer) {
		this.producer = producer;
	}
		
	
	public List<DetailFood> getDetails() {
		return detail_foods;
	}

	public void setDetails(List<DetailFood> details) {
		this.detail_foods = details;
	}

	public void add(DetailFood detail_food) {
		if (this.detail_foods == null) {
			this.detail_foods = new ArrayList<>();
		}
		this.detail_foods.add(detail_food);
	}
	
	public String displayTypeFood() {
		if (type.equals("Food")) {
			return "Thức ăn";
		}
		return "Nước uống";
	}
	
	@Override
	public String toString() {
		return "Food [id=" + id + ", name=" + name + ", quanlity=" + quanlity + ", unit=" + unit + ", price=" + price
				+ ", type=" + type + ", producer=" + producer + "]";
	}
			
}
