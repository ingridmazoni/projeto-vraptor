package br.com.caelum.vraptor.estante;

import java.util.List;

import br.com.caelum.vraptor.dao.LivroDao;
import br.com.caelum.vraptor.entity.Livro;
import br.com.caelum.vraptor.repository.Estante;


public class UmaEstanteNoBancoDeDados implements Estante{
	
	private final LivroDao dao;
	
	public UmaEstanteNoBancoDeDados(LivroDao dao) {
			this.dao = dao;
	}

	@Override
	public void guarda(Livro livro) {
		
		
		
	}

	@Override
	public List<Livro> todosOsLivros() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Livro buscaPorIsbn(String isbn) {
		// TODO Auto-generated method stub
		return null;
	}



	

}
