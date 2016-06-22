package br.com.brunobrasilweb.api.controller;

import br.com.brunobrasilweb.api.service.AbstractService;
import br.com.brunobrasilweb.api.service.TesteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.brunobrasilweb.api.model.Teste;

@RestController
@RequestMapping("teste")
public class TesteController extends AbstractController<Teste, Long> {

	@Autowired
	private TesteService testeService;

	@Override
	protected AbstractService<Teste, Long> getService() {
		return testeService;
	}

}
