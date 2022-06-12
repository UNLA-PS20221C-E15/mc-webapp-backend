package unlaps20221ce15.mcdonalsapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unlaps20221ce15.mcdonalsapp.entities.Category;
import unlaps20221ce15.mcdonalsapp.entities.Product;
import unlaps20221ce15.mcdonalsapp.models.CategoryModel;
import unlaps20221ce15.mcdonalsapp.models.ProductModel;
import unlaps20221ce15.mcdonalsapp.services.IProductService;
import unlaps20221ce15.mcdonalsapp.services.implementation.CategoryService;

@RestController
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	@Qualifier("productService")
	private IProductService productService;
	
	@Autowired
	@Qualifier("categoryService")
	private CategoryService categoryService;
	
	@GetMapping("/products")
	public List<Product> getProducts() {
		return productService.getAll();
	}
	
	@GetMapping("/categories")
	public List<Category> getCategories() {
		return categoryService.getAll();
	}
	
	@PostMapping("/agregarProducto")
	public ProductModel agregarProducto(@RequestBody ProductModel product) {
		return productService.insertOrUpdate(product);
	}
	
	@PutMapping("/actualizarProducto")
	public ProductModel actualizarProducto(@RequestBody ProductModel product) {
		return productService.insertOrUpdate(product);
	}
	
	@DeleteMapping("/borrarProducto")
	public boolean borrarCategoria(@RequestBody Product product) {
		return productService.remove(product);
	}
	
	@PostMapping("/agregarCategoria")
	public CategoryModel agregarCategoria(@RequestBody CategoryModel category) {
		return categoryService.insertOrUpdate(category);
	}
	
	@PutMapping("/actualizarCategoria")
	public CategoryModel actualizarCategoriao(@RequestBody CategoryModel category) {
		return categoryService.insertOrUpdate(category);
	}
	
	@DeleteMapping("/borrarCategoria")
	public boolean borrarProducto(@RequestBody Category category) {
		return categoryService.remove(category);
	}
}
