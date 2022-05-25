package unlaps20221ce15.mcdonalsapp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import unlaps20221ce15.mcdonalsapp.entities.Product;

@Repository("productRepository")
public interface IProductRepository extends JpaRepository<Product, Integer> {

	public abstract	List<Product> findAll();
	
}

