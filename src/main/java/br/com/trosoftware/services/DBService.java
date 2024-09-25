package br.com.trosoftware.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.trosoftware.domain.Usuario;
import br.com.trosoftware.domain.enums.Perfil;
import br.com.trosoftware.repositories.UsuarioRepository;

@Service
public class DBService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public void instanciaDB() {
		Usuario u1 = new Usuario(null, "Thaynan Oliveira", "452.726.098-75", "thaynan@mail.com", "123");
		u1.addPerfis(Perfil.ADMIN);
		usuarioRepository.saveAll(Arrays.asList(u1));
	}
}
