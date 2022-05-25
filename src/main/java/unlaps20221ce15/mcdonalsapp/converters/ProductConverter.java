package unlaps20221ce15.mcdonalsapp.converters;

import unlaps20221ce15.mcdonalsapp.entities.Product;
import unlaps20221ce15.mcdonalsapp.models.ProductModel;

public class ProductConverter {
	
	public ProductModel entityToModel(Product product) {
		return new ProductModel(product.getIdProduct(), product.getCode(), product.getPrice(), product.getDiscount(),  product.isEnable(),
				product.isEnableDiscount(), product.getTimesBought(), product.getUrlImage());
	}

	public Product modelToEntity(ProductModel productModel) {
		return new Product(productModel.getCode(), productModel.getPrice(), productModel.getDiscount(), productModel.isEnable(),
				productModel.isEnableDiscount(), productModel.getUrlImage(), productModel.getTimesBought());
	}

}
