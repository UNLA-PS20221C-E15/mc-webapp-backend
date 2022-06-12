package unlaps20221ce15.mcdonalsapp.dao.api;

import unlaps20221ce15.mcdonalsapp.entities.*;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDaoAPI extends CrudRepository<Usuario, Long> {

	Usuario findByUsername(String usuario);
}
