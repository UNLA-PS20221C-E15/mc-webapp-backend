package unlaps20221ce15.mcdonalsapp.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import unlaps20221ce15.mcdonalsapp.converters.ProductConverter;
import unlaps20221ce15.mcdonalsapp.entities.Product;
import unlaps20221ce15.mcdonalsapp.repositories.IProductRepository;
import unlaps20221ce15.mcdonalsapp.services.IProductService;

@Qualifier("productService")
@Service
public class ProductService implements IProductService {

	@Autowired
	@Qualifier("productRepository")
	private IProductRepository productRepository;
	
	@Autowired
	@Qualifier("productConverter")
	private ProductConverter productConverter;
	
	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}
	
	
	
	
}
