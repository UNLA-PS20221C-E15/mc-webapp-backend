package unlaps20221ce15.mcdonalsapp.services;

import java.util.List;

import unlaps20221ce15.mcdonalsapp.entities.Category;
import unlaps20221ce15.mcdonalsapp.models.CategoryModel;

public interface ICategoryService {
	

	public List<Category> getAll();
	
	public CategoryModel insertOrUpdate(CategoryModel categoryModel);
	
	public boolean remove(Category category);

}
