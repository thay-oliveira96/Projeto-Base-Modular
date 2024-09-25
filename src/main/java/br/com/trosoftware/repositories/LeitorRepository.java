package br.com.trosoftware.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.trosoftware.domain.Leitor;

public interface LeitorRepository extends JpaRepository<Leitor, Integer> {

}
