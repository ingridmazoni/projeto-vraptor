package br.com.caelum.vraptor.controller;

import java.util.List;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.entity.Livro;
import br.com.caelum.vraptor.estante.UmaEstanteNoBancoDeDados;
import br.com.caelum.vraptor.repository.Estante;

@Controller
public class LivrosController {
	private  Estante estante;
	
	public LivrosController() {
		estante = new UmaEstanteNoBancoDeDados(null);
	}

	
	public void formulario() {}
	
	
	public void salva(Livro livro,Result result) {
		estante.guarda(livro);
		result.include("mensagem", "Livro salvo com sucesso!");
		result.redirectTo(this).lista();
		}
	
	
	public List<Livro> lista() {
		
		return estante.todosOsLivros();
			
	}
	
	
	public void edita(String isbn,Result result) {
		Livro livroEncontrado = estante.buscaPorIsbn(isbn);
		result.include(livroEncontrado);
		result.of(this).formulario();
		
	}

}
