package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="Payment")
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPayment")
	private Long idPayment;
	
	@Column(name = "address", nullable=false)
	private String address;
	
	@Column(name = "card", nullable=false)
	private Long card;
	
	@OneToMany(fetch=FetchType.LAZY)
    @JoinColumn(name="Payment_idPayment", nullable=false)
    private Payment payment;
    
	
	public Payment() {
		super();
	}
	
	public Payment(Long idPayment, String address, Long card) {
		super();
		this.idPayment = idPayment;
		this.address = address;
		this.card = card;
	}
	public Long getIdPayment() {
		return idPayment;
	}
	public void setIdPayment(Long idPayment) {
		this.idPayment = idPayment;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getCard() {
		return card;
	}
	public void setCard(Long card) {
		this.card = card;
	}
	@Override
	public String toString() {
		return "Payment [idPayment=" + idPayment + ", address=" + address + ", card=" + card + "]";
	}
	
}
