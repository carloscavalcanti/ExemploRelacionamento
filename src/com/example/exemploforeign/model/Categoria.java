package com.example.exemploforeign.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class Categoria {
	
	@DatabaseField(generatedId=true)
	private Integer id;
	@DatabaseField
	private String descricao;
	
	public Categoria() {
	}
	
	public Categoria(String descricao) {
		this.descricao = descricao;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}
