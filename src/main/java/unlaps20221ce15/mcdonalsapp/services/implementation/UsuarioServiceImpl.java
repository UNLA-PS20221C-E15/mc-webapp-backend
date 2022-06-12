package unlaps20221ce15.mcdonalsapp.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;


import unlaps20221ce15.mcdonalsapp.commons.*;
import unlaps20221ce15.mcdonalsapp.dao.api.*;
import unlaps20221ce15.mcdonalsapp.entities.*;
import unlaps20221ce15.mcdonalsapp.services.api.*;

@Service
public class UsuarioServiceImpl extends GenericServiceImpl<Usuario, Long> implements UsuarioServiceAPI {

	@Autowired
	private UsuarioDaoAPI usuarioDaoAPI;
	
	@Override
	public CrudRepository<Usuario, Long> getDao() {
		return usuarioDaoAPI;
	}

}
