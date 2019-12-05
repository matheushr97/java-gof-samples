package concretes.builder;

import abstracts.Artigo;
import abstracts.ArtigoBuilder;
import concretes.artigo.Revista;

import java.util.Arrays;

public class RevistaBuilder implements ArtigoBuilder {

	private Artigo artigo;

	public RevistaBuilder() {
		this.artigo = new Revista();
	}

	public static ArtigoBuilder builder() {
		return new RevistaBuilder();
	}

	@Override
	public ArtigoBuilder autor(String autor) {
		this.artigo.setAutor(autor);
		return this;
	}

	@Override
	public ArtigoBuilder titulo(String titulo) {
		this.artigo.setTitulo(titulo);
		return this;
	}

	@Override
	public ArtigoBuilder assuntos(String... assuntos) {
		this.artigo.setMarcacoes(Arrays.asList(assuntos));
		return this;
	}

	@Override
	public ArtigoBuilder totalDePaginas(int total) {
		this.artigo.setPaginas(total);
		return this;
	}

	@Override
	public ArtigoBuilder publicadoEm(int dia, int mes, int ano) {

		return this;
	}

	@Override
	public ArtigoBuilder texto(String texto) {
		this.artigo.setTexto(texto);
		return this;
	}

	@Override
	public Artigo build() {
		return artigo;
	}

}
