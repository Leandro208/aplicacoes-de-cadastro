package alunos;

public class Aluno {
	
	private String nome;
	private String matricula;
	private String sexo;
	private String curso;
	
	
	
	
	@Override
	public String toString() {
		return "Aluno [nome: " + nome + ", matricula: " + matricula + "] ";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	

}
