package unlaps20221ce15.mcdonalsapp.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
//import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotNull;

import org.hibernate.Hibernate;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javassist.compiler.ast.Variable;

@JsonIgnoreProperties("hibernateLazyInitializer")
@Entity
@Table(name = "category")
public class Category implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCategory;
	
	@Column (name = "category")
	public String category;
	
	@Column (name = "discountCategory", nullable = false)
	private double discountCategory;
	
	@Column (name = "enableDiscountCategory", nullable = false)
	private boolean enableDiscountCategory;
	
	@Column(name = "urlImage")
	private String urlImage;
	
	@OneToMany(mappedBy = "category", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Product> products;
	
	public Category() {
	}

	public Category( String category, double discountCategory, boolean enableDiscountCategory, String urlImage) {
		super();
		this.category = category;
		this.discountCategory = discountCategory;
		this.enableDiscountCategory = enableDiscountCategory;
		this.urlImage = urlImage;
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

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
}
