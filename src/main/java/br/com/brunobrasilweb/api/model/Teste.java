package br.com.brunobrasilweb.api.model;

import javax.persistence.Entity;

@Entity
public class Teste extends AbstractModel<Long> {

	private String name;
	private String description;

	public Teste() {

	}

	public Teste(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
