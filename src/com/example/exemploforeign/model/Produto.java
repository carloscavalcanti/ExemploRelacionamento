package com.example.exemploforeign.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class Produto {

	@DatabaseField(generatedId=true)
	private Integer id;
	@DatabaseField
	private String nome;
	@DatabaseField(canBeNull = false, foreign = true)
	private Categoria categoria;
	
	public Produto() {
	}
	
	public Produto(String nome, Categoria categoria) {
		this.nome = nome;
		this.categoria = categoria;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	
}
