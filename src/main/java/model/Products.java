package model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="Products")
public class Products {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProducts")
	private Long idProducts;
	
	@Column(name = "product_name", nullable=false)
	private String product_name;
	
	@Column(name = "price", nullable=false)
	private Double price;
	
	@Column(name = "stock", nullable=false)
	private Long stock;
	
	@Column(name = "image", nullable=false)
	private String image;
	
	 @OneToMany(mappedBy="products")
	    private Set<OrderProducts> orderProducts;
	    
	
	public Products() {
		super();
	}


	public Products(Long idProducts, String product_name, Double price, Long stock, String image) {
		super();
		this.idProducts = idProducts;
		this.product_name = product_name;
		this.price = price;
		this.stock = stock;
		this.image = image;
	}


	public Long getIdProducts() {
		return idProducts;
	}


	public void setIdProducts(Long idProducts) {
		this.idProducts = idProducts;
	}


	public String getProduct_name() {
		return product_name;
	}


	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public Long getStock() {
		return stock;
	}


	public void setStock(Long stock) {
		this.stock = stock;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	@Override
	public String toString() {
		return "Products [idProducts=" + idProducts + ", product_name=" + product_name + ", price=" + price + ", stock="
				+ stock + ", image=" + image + "]";
	}
	
	

}
