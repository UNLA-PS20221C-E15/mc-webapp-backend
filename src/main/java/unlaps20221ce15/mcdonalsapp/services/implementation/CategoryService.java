package unlaps20221ce15.mcdonalsapp.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import unlaps20221ce15.mcdonalsapp.converters.CategoryConverter;
import unlaps20221ce15.mcdonalsapp.entities.Category;
import unlaps20221ce15.mcdonalsapp.repositories.ICategoryRepository;
import unlaps20221ce15.mcdonalsapp.services.ICategoryService;
@Qualifier("categoryRepository")
@Service
public class CategoryService implements ICategoryService {

	
	@Autowired
	@Qualifier("categoryRepository")
	private ICategoryRepository categoryRepository;
	
	@Autowired
	@Qualifier("categoryConverter")
	private CategoryConverter categoryConverter;
	
	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}
	
}
