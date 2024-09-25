package br.com.trosoftware.domain;

import br.com.trosoftware.domain.enums.Perfil;
import jakarta.persistence.Entity;

@Entity
public class Leitor extends Pessoa {
	private static final long serialVersionUID = 1L;

	public Leitor() {
		super();
		addPerfis(Perfil.LEITOR);
	}

	public Leitor(Integer id, String nome, String cpf, String email, String senha) {
		super(id, nome, cpf, email, senha);
	}
	
	

}
