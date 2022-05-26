package unlaps20221ce15.mcdonalsapp.services.implementation;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import unlaps20221ce15.mcdonalsapp.entities.Category;
import unlaps20221ce15.mcdonalsapp.models.CategoryModel;
import unlaps20221ce15.mcdonalsapp.repositories.ICategoryRepository;
import unlaps20221ce15.mcdonalsapp.services.ICategoryService;
@Qualifier("categoryRepository")
@Service
public class CategoryService implements ICategoryService {

	
	@Autowired
	@Qualifier("categoryRepository")
	private ICategoryRepository categoryRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	private CategoryModel entityToModel(Category category) {
		CategoryModel categoryModel = new CategoryModel();
		
		categoryModel = modelMapper.map(category, CategoryModel.class);
		
		return categoryModel;
	}
	
	private Category modelToEntity(CategoryModel categoryModel) {
		Category category = new Category();
		
		category = modelMapper.map(categoryModel, Category.class);
		
		return category;
	}
	
	@Override
	public CategoryModel insertOrUpdate(CategoryModel categoryModel) {
		Category category = categoryRepository.save(modelToEntity(categoryModel));
		
		return entityToModel(category);
	}
	
	@Override
	public boolean remove(Category category) {
		try {
			categoryRepository.delete(category);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}
	
}