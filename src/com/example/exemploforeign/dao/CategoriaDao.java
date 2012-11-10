package com.example.exemploforeign.dao;

import java.sql.SQLException;

import com.example.exemploforeign.model.Categoria;
import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;

public class CategoriaDao extends BaseDaoImpl<Categoria, Integer>{

	public CategoriaDao(ConnectionSource connectionSource) throws SQLException {
		super(connectionSource, Categoria.class);
	}

}
