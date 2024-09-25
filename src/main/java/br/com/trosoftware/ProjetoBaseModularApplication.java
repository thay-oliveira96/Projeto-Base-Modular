package br.com.trosoftware;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.trosoftware.domain.Usuario;
import br.com.trosoftware.domain.enums.Perfil;
import br.com.trosoftware.repositories.UsuarioRepository;

@SpringBootApplication
public class ProjetoBaseModularApplication implements CommandLineRunner {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetoBaseModularApplication.class, args);
	}

	public void run(String... args) throws Exception {
		Usuario u1 = new Usuario(null, "Thaynan Oliveira", "452.726.098-75", "thaynan@mail.com", "123");
		u1.addPerfis(Perfil.ADMIN);
		usuarioRepository.saveAll(Arrays.asList(u1));
	}

}
