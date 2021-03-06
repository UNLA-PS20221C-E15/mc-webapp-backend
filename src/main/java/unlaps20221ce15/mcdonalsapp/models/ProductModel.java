package unlaps20221ce15.mcdonalsapp.models;

public class ProductModel {
	
	private int idProduct;
	
	private String product;
	
	private String code;
	
	private double price;
	
	private double discount;
	
	private boolean enable;
	
	private boolean enableDiscount;
	
	private int timesBought;
	
	private String urlImage;
	
	private CategoryModel category;
	
	public ProductModel( ) {}
	
	

	public ProductModel(int idProduct, String product, String code, double price, double discount, boolean enable,
			boolean enableDiscount, int timesBought, String urlImage, CategoryModel category) {
		super();
		this.idProduct = idProduct;
		this.product = product;
		this.code = code;
		this.price = price;
		this.discount = discount;
		this.enable = enable;
		this.enableDiscount = enableDiscount;
		this.timesBought = timesBought;
		this.urlImage = urlImage;
		this.category = category;
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

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	public CategoryModel getCategory() {
		return category;
	}

	public void setCategory(CategoryModel category) {
		this.category = category;
	}
}
