package pessoa;

public class Livros {
	
	@Override
	public String toString() {
		return "Livros [titulo=" + titulo + ", autores=" + autores + "]";
	}

	private String titulo;
	
	private String ano;
	
	private String editora;
	
	private String autores;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getAutores() {
		return autores;
	}

	public void setAutores(String autores) {
		this.autores = autores;
	}
	
	

}
