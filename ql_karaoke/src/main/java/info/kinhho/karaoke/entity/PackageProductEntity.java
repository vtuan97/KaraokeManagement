package info.kinhho.karaoke.entity;

import java.io.Serializable;
import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "package_product")
public class PackageProductEntity extends CommonEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public PackageProductEntity() {
		super();
	}

	@ManyToOne
	private ProductEntity productEntity;
	
	@ManyToOne
	private PackageEntity packageEntity;
	
	@Column(name = "quanlity")
	private double quanlity;
	
	@Column(name = "exp_at")
	private ZonedDateTime expAt;

	public ProductEntity getProductEntity() {
		return productEntity;
	}

	public void setProductEntity(ProductEntity productEntity) {
		this.productEntity = productEntity;
	}

	public PackageEntity getPackageEntity() {
		return packageEntity;
	}

	public void setPackageEntity(PackageEntity packageEntity) {
		this.packageEntity = packageEntity;
	}

	public double getQuanlity() {
		return quanlity;
	}

	public void setQuanlity(double quanlity) {
		this.quanlity = quanlity;
	}

	public ZonedDateTime getExpAt() {
		return expAt;
	}

	public void setExpAt(ZonedDateTime expAt) {
		this.expAt = expAt;
	}

	@Override
	public String toString() {
		return "PackageProductEntity [productEntity=" + productEntity + ", packageEntity=" + packageEntity
				+ ", quanlity=" + quanlity + ", expAt=" + expAt + "]";
	}
}
