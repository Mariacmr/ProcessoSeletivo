package processoSeletivo;

import java.util.Calendar;

import javax.persistence.Column;
@Entity
public class Curriculo {
	
	@Id
	@GeneratedValue
	@Column(name="id_curriculo")
	private long id;
	@Column(nullable=false, unique=true)
	private Aluno aluno;
	private String contribuicoes;
	private String experiencias;
	private Calendar dataInicioCurso;
	private Calendar dataTerminoCurso;
	
	Curriculo (Aluno aluno, String contribuicoes, String experiencias, Calendar dataInicio, Calendar dataTermino) {
		this.setAluno(aluno);
		this.setContribuicoes(contribuicoes);
		this.setExperiencias(experiencias);
		this.setDataInicioCurso(dataInicio);
		this.setDataTerminoCurso(dataTermino);
	}
	Curriculo () {
		
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public String getContribuicoes() {
		return contribuicoes;
	}
	public void setContribuicoes(String contribuicoes) {
		this.contribuicoes = contribuicoes;
	}
	public String getExperiencias() {
		return experiencias;
	}
	public void setExperiencias(String experiencias) {
		this.experiencias = experiencias;
	}
	public Calendar getDataInicioCurso() {
		return dataInicioCurso;
	}
	public void setDataInicioCurso(Calendar dataInicioCurso) {
		this.dataInicioCurso = dataInicioCurso;
	}
	public Calendar getDataTerminoCurso() {
		return dataTerminoCurso;
	}
	public void setDataTerminoCurso(Calendar dataTerminoCurso) {
		this.dataTerminoCurso = dataTerminoCurso;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aluno == null) ? 0 : aluno.hashCode());
		result = prime * result + ((contribuicoes == null) ? 0 : contribuicoes.hashCode());
		result = prime * result + ((dataInicioCurso == null) ? 0 : dataInicioCurso.hashCode());
		result = prime * result + ((dataTerminoCurso == null) ? 0 : dataTerminoCurso.hashCode());
		result = prime * result + ((experiencias == null) ? 0 : experiencias.hashCode());
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
		Curriculo other = (Curriculo) obj;
		if (aluno == null) {
			if (other.aluno != null)
				return false;
		} else if (!aluno.equals(other.aluno))
			return false;
		if (contribuicoes == null) {
			if (other.contribuicoes != null)
				return false;
		} else if (!contribuicoes.equals(other.contribuicoes))
			return false;
		if (dataInicioCurso == null) {
			if (other.dataInicioCurso != null)
				return false;
		} else if (!dataInicioCurso.equals(other.dataInicioCurso))
			return false;
		if (dataTerminoCurso == null) {
			if (other.dataTerminoCurso != null)
				return false;
		} else if (!dataTerminoCurso.equals(other.dataTerminoCurso))
			return false;
		if (experiencias == null) {
			if (other.experiencias != null)
				return false;
		} else if (!experiencias.equals(other.experiencias))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Curriculo [aluno=" + aluno + ", contribuicoes=" + contribuicoes + ", experiencias=" + experiencias
				+ ", dataInicioCurso=" + dataInicioCurso + ", dataTerminoCurso=" + dataTerminoCurso + "]";
	}
	
	
	
	
	
}
