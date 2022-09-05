package core;
// subclasse
public class Estudante extends Pessoa {
	private int numeroMatricula;
	private String curso;
	
	public Estudante(String nome, String email, String telefone, int numMatricula, String curso) {
		super(nome, email, telefone);
		this.numeroMatricula = numMatricula;
		this.curso = curso;
	}
	
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	// aqui eu faço uma sobrescrita de método = redefinição
	public String exibirInfo() {
		return super.nome + " / " + super.email + " / " + super.telefone + " / " + this.numeroMatricula + " / " + this.curso;
	}
	
}
