package unlaps20221ce15.mcdonalsapp.converters;

import unlaps20221ce15.mcdonalsapp.entities.Category;
import unlaps20221ce15.mcdonalsapp.models.CategoryModel;

public class CategoryConverter {
	
	public CategoryModel entityToModel(Category category) {
		return new CategoryModel(category.getIdCategory(), category.getCategory(), category.getDiscountCategory(), category.isEnableDiscountCategory());
	}

	public Category modelToEntity(CategoryModel categoryModel) {
		return new Category(categoryModel.getCategory(), categoryModel.getDiscountCategory(), categoryModel.isEnableDiscountCategory());
	}

}
