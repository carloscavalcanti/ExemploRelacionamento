package com.example.exemploforeign.dao;

import java.sql.SQLException;

import com.example.exemploforeign.model.Produto;
import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;

public class ProdutoDao extends BaseDaoImpl<Produto, Integer> {

	public ProdutoDao(ConnectionSource connectionSource) throws SQLException {
		super(connectionSource,Produto.class);
	}

}
