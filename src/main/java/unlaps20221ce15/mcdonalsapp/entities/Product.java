package unlaps20221ce15.mcdonalsapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProduct;
	
	@Column(name = "code", nullable = false)
	private String code;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "discount")
	private double discount;
	
	@Column(name = "enable")
	private boolean enalbe;
	
	@Column(name = "enableDiscount")
	private boolean enableDiscount;
	
	@Column(name = "timesBought")
	private int timesBought;
	
	@Column(name = "urlImage")
	private String urlImage;
	
	public Product( ) {}

	public Product( String code, double price, double discount, boolean enalbe, boolean enableDiscount, String urlImage,
			int timesBought) {
		super();
		this.code = code;
		this.price = price;
		this.discount = discount;
		this.enalbe = enalbe;
		this.enableDiscount = enableDiscount;
		this.timesBought = timesBought;
		this.urlImage = urlImage;
	}


	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public boolean isEnalbe() {
		return enalbe;
	}

	public void setEnalbe(boolean enalbe) {
		this.enalbe = enalbe;
	}

	public boolean isEnableDiscount() {
		return enableDiscount;
	}

	public void setEnableDiscount(boolean enableDiscount) {
		this.enableDiscount = enableDiscount;
	}

	public int getTimesBought() {
		return timesBought;
	}

	public void setTimesBought(int timesBought) {
		this.timesBought = timesBought;
	}

	public String getUrlImage() {
		return urlImage;
	}

	

}
