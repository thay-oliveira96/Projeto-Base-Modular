package br.com.trosoftware.domain;

import br.com.trosoftware.domain.enums.Perfil;
import jakarta.persistence.Entity;

@Entity
public class Usuario extends Pessoa{
	private static final long serialVersionUID = 1L;

	public Usuario() {
		super();
		addPerfis(Perfil.USUARIO);
	}

	public Usuario(Integer id, String nome, String cpf, String email, String senha) {
		super(id, nome, cpf, email, senha);
	}
}
