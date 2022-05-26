package unlaps20221ce15.mcdonalsapp.services;

import java.util.List;

import unlaps20221ce15.mcdonalsapp.entities.Product;
import unlaps20221ce15.mcdonalsapp.models.ProductModel;

public interface IProductService {

	
	public List<Product> getAll();
	
	public ProductModel insertOrUpdate(ProductModel productModel);
	
	public boolean remove(Product product);
}
