package processoSeletivo;

import java.util.Calendar;

@Entity
public class Inscricao {
	
	Inscricao(Aluno aluno, Curriculo curriculo) {

	}
	Inscricao () {
		
	}
	@Id
	@GeneratedValue
	private long id;
	private Calendar data;
	@Column(nome = "nome_aluno", nullable = false)
	private Aluno aluno;
	
	public Aluno getAluno() {
		return aluno;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aluno == null) ? 0 : aluno.hashCode());
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
		Inscricao other = (Inscricao) obj;
		if (aluno == null) {
			if (other.aluno != null)
				return false;
		} else if (!aluno.equals(other.aluno))
			return false;
		return true;
	}
	
	
	

}
