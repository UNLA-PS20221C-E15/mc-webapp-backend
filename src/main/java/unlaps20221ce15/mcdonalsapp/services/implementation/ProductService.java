package unlaps20221ce15.mcdonalsapp.services.implementation;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import unlaps20221ce15.mcdonalsapp.entities.Product;
import unlaps20221ce15.mcdonalsapp.models.ProductModel;
import unlaps20221ce15.mcdonalsapp.repositories.IProductRepository;
import unlaps20221ce15.mcdonalsapp.services.IProductService;

@Qualifier("productService")
@Service
public class ProductService implements IProductService {

	@Autowired
	@Qualifier("productRepository")
	private IProductRepository productRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	private ProductModel entityToModel(Product product) {
		ProductModel productModel = new ProductModel();
		
		productModel = modelMapper.map(product, ProductModel.class);
		
		return productModel;
	}
	
	private Product modelToEntity(ProductModel productModel) {
		Product product = new Product();
		
		product = modelMapper.map(productModel, Product.class);
		
		return product;
	}
	
	public ProductModel insertOrUpdate(ProductModel productModel) {
		Product product = productRepository.save(modelToEntity(productModel));
		
		return entityToModel(product);
	}
	
	public boolean remove(Product product) {
		try {
			productRepository.delete(product);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}
}
