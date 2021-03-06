package br.com.caelum.vraptor.estante;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.vraptor.entity.Livro;
import br.com.caelum.vraptor.repository.Estante;

public class UmaEstanteQualquer implements Estante {
	ArrayList<Livro> listaLivros;
	
	
	public UmaEstanteQualquer() {
		listaLivros=new ArrayList<Livro>();
	}

	
	@Override
	public void guarda(Livro livro) {
		listaLivros.add(livro);
		
	}

	@Override
	public List<Livro> todosOsLivros() {
		return listaLivros;
	}

	@Override
	public Livro buscaPorIsbn(String isbn) {
		return todosOsLivros().get(0);
	}

}
