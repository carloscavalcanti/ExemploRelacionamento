package com.example.exemploforeign;

import java.sql.SQLException;

import android.app.Activity;
import android.os.Bundle;

import com.example.exemploforeign.dao.CategoriaDao;
import com.example.exemploforeign.dao.ProdutoDao;
import com.example.exemploforeign.model.Categoria;
import com.example.exemploforeign.model.Produto;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		DatabaseHelper helper = new DatabaseHelper(this);

		try {
			CategoriaDao categoriaDao = new CategoriaDao(helper.getConnectionSource());
			ProdutoDao produtoDao = new ProdutoDao(helper.getConnectionSource());

			Categoria categoriaComida = new Categoria("Comida");
			categoriaDao.create(categoriaComida);
				
			Produto produtoSushi = new Produto("Sushi", categoriaComida);
			produtoDao.create(produtoSushi);
				
			
			Produto produtoPersistido = produtoDao.queryForAll().get(0);
			System.out.println("Produto: " + produtoPersistido.getNome());
			System.out.println("Categoria: "+produtoPersistido.getCategoria().getDescricao());
			System.out.println("CategoriaId: "+produtoPersistido.getCategoria().getId());
			
			categoriaDao.refresh(produtoPersistido.getCategoria());
			
			System.out.println("Refresh");
			System.out.println("Produto: " + produtoPersistido.getNome());
			System.out.println("Categoria: "+produtoPersistido.getCategoria().getDescricao());
			System.out.println("CategoriaId: "+produtoPersistido.getCategoria().getId());
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}


}
