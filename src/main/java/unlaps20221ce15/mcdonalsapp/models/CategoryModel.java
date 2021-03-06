package unlaps20221ce15.mcdonalsapp.models;


public class CategoryModel {
	
	
	private int idCategory;
	
	private String category;
	
	private double discountCategory;
	
	private boolean enableDiscountCategory;

	private String urlImage;
	
	public CategoryModel() {
		super();
	}

	public CategoryModel(int idCategory, String category, double discountCategory, boolean enableDiscountCategory, String urlImage) {
		super();
		this.idCategory = idCategory;
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
	
}
