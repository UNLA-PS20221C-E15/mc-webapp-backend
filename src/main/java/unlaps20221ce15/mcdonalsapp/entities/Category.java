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
	private String discountCategory;
	
	@Column (name = "enableDiscountCategory", nullable = false)
	private String enableDiscountCategory;

	public Category() {
	}

	public Category(String category, String discountCategory, String enableDiscountCategory) {
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

	public String getDiscountCategory() {
		return discountCategory;
	}

	public void setDiscountCategory(String discountCategory) {
		this.discountCategory = discountCategory;
	}

	public String getEnableDiscountCategory() {
		return enableDiscountCategory;
	}

	public void setEnableDiscountCategory(String enableDiscountCategory) {
		this.enableDiscountCategory = enableDiscountCategory;
	}
	
	
	
	
	
	
	
	
}
