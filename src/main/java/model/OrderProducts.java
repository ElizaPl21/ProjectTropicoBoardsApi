package model;

public class OrderProducts {
	private Long quantity;

	public OrderProducts() {
		super();
	}

	public OrderProducts(Long quantity) {
		super();
		this.quantity = quantity;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "OrderProducts [quantity=" + quantity + "]";
	}
	
	

}
