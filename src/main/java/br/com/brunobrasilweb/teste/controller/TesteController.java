package br.com.brunobrasilweb.teste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.brunobrasilweb.teste.model.Teste;
import br.com.brunobrasilweb.teste.repository.TesteRepository;

@RestController
@RequestMapping("api/teste")
public class TesteController {
	
	@Autowired
	private TesteRepository testeRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Teste> index() {
		return this.testeRepository.findAll();
	}
	
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Teste get(@PathVariable Long id) {
		Teste teste = this.testeRepository.findOne(id);
		return teste;
	}	
	
	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public Teste post(Teste teste) {		
		return this.testeRepository.save(teste);
	}
	
	@RequestMapping(value = "/put/{id}", method = RequestMethod.PUT)
	public HttpStatus put(@PathVariable Long id, Teste teste) {
		try {
			teste.setId(id);
			this.testeRepository.save(teste);
			return HttpStatus.OK;
		} catch (Exception e) {
			return HttpStatus.INTERNAL_SERVER_ERROR;
		}
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public HttpStatus delete(@PathVariable Long id) {
		try {
			this.testeRepository.delete(id);
			return HttpStatus.OK;
		} catch (Exception e) {
			return HttpStatus.INTERNAL_SERVER_ERROR;
		}
	}
	
}
