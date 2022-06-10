package unlaps20221ce15.mcdonalsapp.controllers;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unlaps20221ce15.mcdonalsapp.entities.*;
import unlaps20221ce15.mcdonalsapp.services.api.*;


@RestController
@RequestMapping(value = "/api/users/")
@CrossOrigin("*")
public class UsuarioRestController {

	@Autowired
	private UsuarioServiceAPI usuarioServiceAPI;

    @Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
    
	@GetMapping(value = "/all")
	public List<Usuario> getAll() {
		return usuarioServiceAPI.getAll();
	}
	
	@GetMapping(value = "/find/{id}")
	public Usuario find(@PathVariable Long id) {
		return usuarioServiceAPI.get(id);
	}

	@PostMapping(value = "/save")
	public ResponseEntity<Usuario> save(@RequestBody @Valid Usuario usuario) {
        String encodePassword = bCryptPasswordEncoder.encode(usuario.getPassword());
		String role = "USUARIO";
		usuario.setRoleName(role);
        usuario.setPassword(encodePassword);
		Usuario obj = usuarioServiceAPI.save(usuario);
		return new ResponseEntity<Usuario>(obj, HttpStatus.OK);
	}

	@GetMapping(value = "/delete/{id}")
	public ResponseEntity<Usuario> delete(@PathVariable Long id) {
		Usuario usuario = usuarioServiceAPI.get(id);
		if (usuario != null) {
			usuarioServiceAPI.delete(id);
		} else {
			return new ResponseEntity<Usuario>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
	}

}

