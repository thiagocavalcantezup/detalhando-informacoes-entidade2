package br.com.zup.handora.detalhandoinformacoesentidade2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zup.handora.detalhandoinformacoesentidade2.models.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
