package info.kinhho.karaoke.entity;

import java.io.Serializable;
import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "package")
public class PackageEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "exp_at")
	private ZonedDateTime expAt;
	
	@Column(name = "createda_at")
	private ZonedDateTime createAt;
	
	@Column(name = "updated_at")
	private ZonedDateTime updatedAt;
	
	@Column(name = "active")
	private boolean active;
	
	@ManyToOne
	private SupplierEntity supplierEntity;

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ZonedDateTime getExpAt() {
		return expAt;
	}

	public void setExpAt(ZonedDateTime expAt) {
		this.expAt = expAt;
	}

	public ZonedDateTime getCreateAt() {
		return createAt;
	}

	public void setCreateAt(ZonedDateTime createAt) {
		this.createAt = createAt;
	}

	public ZonedDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(ZonedDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public SupplierEntity getSupplierEntity() {
		return supplierEntity;
	}

	public void setSupplierEntity(SupplierEntity supplierEntity) {
		this.supplierEntity = supplierEntity;
	}

	@Override
	public String toString() {
		return "PackageEntity [id=" + id + ", status=" + status + ", expAt=" + expAt + ", createAt=" + createAt
				+ ", updatedAt=" + updatedAt + ", active=" + active + ", supplierEntity=" + supplierEntity + "]";
	}
}
