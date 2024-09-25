package br.com.trosoftware.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.trosoftware.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
