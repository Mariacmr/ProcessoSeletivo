package processoSeletivo;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Aluno {

	@Id
	@GeneratedValue
	private long id;
	private String nome;
	private Calendar dataNascimento;
	private String curso;
	private int periodo;
	@Column(nullable=false, length=50, unique=true)
	private int matricula;
	private Curriculo curriculo;
	@Transient
	private Integer idade;
	
	Aluno (String nome, Calendar dataNascimento, String curso, int periodo, int matricula) {
		this.setNome(nome);
		this.setDataNascimento(dataNascimento);
		this.setCurso(curso);
		this.setPeriodo(periodo);
		this.setMatricula(matricula);
	}
	
	Aluno(){
		
	}
	
	public Curriculo getCurriculo() {
		return curriculo;
	}
	public void setCurriculo(Curriculo curriculo) {
		this.curriculo = curriculo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((curriculo == null) ? 0 : curriculo.hashCode());
		result = prime * result + ((curso == null) ? 0 : curso.hashCode());
		result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result + matricula;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + periodo;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (curriculo == null) {
			if (other.curriculo != null)
				return false;
		} else if (!curriculo.equals(other.curriculo))
			return false;
		if (curso == null) {
			if (other.curso != null)
				return false;
		} else if (!curso.equals(other.curso))
			return false;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (matricula != other.matricula)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (periodo != other.periodo)
			return false;
		return true;
	}
	public boolean realizarInscricao(Aluno aluno, Curriculo curriculo) {
		Inscricao inscricao = new Inscricao (aluno, curriculo);
		return true;		
	}
	
}
