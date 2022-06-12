package unlaps20221ce15.mcdonalsapp.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties("hibernateLazyInitializer")
@Entity
@Table(name = "product")
public class Product implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProduct;
	
	@Column(name = "product", nullable = false)
	private String product;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "code", nullable = false)
	private String code;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "discount")
	private double discount;
	
	@Column(name = "enable")
	private boolean enable;
	
	@Column(name = "enableDiscount")
	private boolean enableDiscount;
	
	@Column(name = "timesBought")
	private int timesBought;
	
	@Column(name = "urlImage")
	private String urlImage;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false, cascade=CascadeType.ALL)
	@JoinColumn(name = "idCategory", nullable = false)
	private Category category;
	
	public Product( ) {}

	public Product( String product, String description, String code, double price, double discount, boolean enable, boolean enableDiscount, String urlImage,
			int timesBought, Category category) {
		super();
		this.product = product;
		this.description = description;
		this.code = code;
		this.price = price;
		this.discount = discount;
		this.enable = enable;
		this.enableDiscount = enableDiscount;
		this.timesBought = timesBought;
		this.urlImage = urlImage;
		this.category = category;
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
	
	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
