package br.com.brunobrasilweb.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.brunobrasilweb.api.model.Teste;

@Repository
public interface TesteRepository extends JpaRepository<Teste, Long> {

}

