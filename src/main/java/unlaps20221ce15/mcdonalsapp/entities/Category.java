package unlaps20221ce15.mcdonalsapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.NotNull;
@Entity
@Table(name = "category")
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCategory;
	
//	@NotNull(message="El nombre de la categoria es obligatorio")
	@Column (name = "category", nullable = false)
	private String category;
	
	@Column (name = "discountCategory", nullable = false)
	private double discountCategory;
	
	@Column (name = "enableDiscountCategory", nullable = false)
	private boolean enableDiscountCategory;

	public Category() {
	}

	public Category(String category, double discountCategory, boolean enableDiscountCategory) {
		super();
		this.category = category;
		this.discountCategory = discountCategory;
		this.enableDiscountCategory = enableDiscountCategory;
	}

	public int getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getDiscountCategory() {
		return discountCategory;
	}

	public void setDiscountCategory(double discountCategory) {
		this.discountCategory = discountCategory;
	}

	public boolean isEnableDiscountCategory() {
		return enableDiscountCategory;
	}

	public void setEnableDiscountCategory(boolean enableDiscountCategory) {
		this.enableDiscountCategory = enableDiscountCategory;
	}
	
	
	
	
	
	
	
	
}
