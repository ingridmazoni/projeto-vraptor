package br.com.caelum.vraptor.controller;

import java.util.List;

import javax.annotation.Resource;

import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.daoImplementation.UmaEstanteQualquer;
import br.com.caelum.vraptor.entity.Livro;
import br.com.caelum.vraptor.repository.Estante;

@Resource
public class LivrosController {
	
	
	public void formulario() {}
	
	
	
	public void salva(Livro livro) {
		Estante estante = new UmaEstanteQualquer();
		estante.guarda(livro);
		}
	
	
	public List<Livro> lista() {
		
		Estante estante = new UmaEstanteQualquer();
		return estante.todosOsLivros();
			
	}
	
	
	public void edita(String isbn,Result result) {
		
		Estante estante = new UmaEstanteQualquer();
		Livro livroEncontrado = estante.buscaPorIsbn(isbn);
		result.include(livroEncontrado);
		result.of(this).formulario();
		
	}

}
