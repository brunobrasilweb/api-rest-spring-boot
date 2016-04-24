package br.com.brunobrasilweb.teste.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.brunobrasilweb.teste.model.Teste;

@Repository
public interface TesteRepository extends JpaRepository<Teste, Long> {

	static final int PAGE_SIZE = 2;
	
	public default Page<Teste> getList(Integer pageNumber) {
		PageRequest request = new PageRequest(pageNumber, PAGE_SIZE, Sort.Direction.DESC, "id");
		return this.findAll(request);
	}
	

}

