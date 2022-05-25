package unlaps20221ce15.mcdonalsapp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import unlaps20221ce15.mcdonalsapp.entities.Category;


@Repository("categoryRepository")

public interface ICategoryRepository extends JpaRepository<Category, Integer> {

	public abstract	List<Category> findAll();
	
}
