package br.com.trosoftware.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.trosoftware.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
