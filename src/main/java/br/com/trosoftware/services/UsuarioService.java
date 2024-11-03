package br.com.trosoftware.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.trosoftware.domain.Usuario;
import br.com.trosoftware.domain.dtos.UsuarioDTO;
import br.com.trosoftware.domain.idm.IDMException;
import br.com.trosoftware.repositories.UsuarioRepository;
import br.com.trosoftware.services.exceptions.ObjectnotFoundExcption;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
	public Usuario findById(Integer id) {
		Optional<Usuario> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectnotFoundExcption(IDMException.MSG_EXCEPTION_OBJETO_NAO_ENCONTRADO_ID + id));
	}

	public List<Usuario> findAll() {
		return repository.findAll();
	}
}
