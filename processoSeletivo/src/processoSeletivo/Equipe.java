package processoSeletivo;

import java.util.List;

import javax.persistence.OneToMany;

@Entity
public class Equipe {
	
	@Id
	@GeneratedValue
	@Column(name="Equipe_id")
	private long id;
	@Column(nullable=false, unique = true)
	private Aluno lider;
	@OneToMany(mappedBy="equipe")
	private List<Aluno> alunos;
	private long notaComportamento;
	private long notaComunicacao;
	private long notaLider;
	// Nota do líder como componente de equipe
	private long liderEquipe;
	
	
	
	public long getNotaComportamento() {
		return notaComportamento;
	}
	public void setNotaComportamento(long notaComportamento) {
		this.notaComportamento = notaComportamento;
	}
	public Aluno getLider() {
		return lider;
	}
	public void setLider(Aluno lider) {
		this.lider = lider;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	public long getNotaComunicacao() {
		return notaComunicacao;
	}
	public void setNotaComunicacao(long notaComunicacao) {
		this.notaComunicacao = notaComunicacao;
	}
	public long getNotaLider() {
		return notaLider;
	}
	public void setNotaLider(long notaLider) {
		this.notaLider = notaLider;
	}
	public long getLiderEquipe() {
		return liderEquipe;
	}
	public void setLiderEquipe(long liderEquipe) {
		this.liderEquipe = liderEquipe;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alunos == null) ? 0 : alunos.hashCode());
		result = prime * result + ((lider == null) ? 0 : lider.hashCode());
		result = prime * result + (int) (liderEquipe ^ (liderEquipe >>> 32));
		result = prime * result + (int) (notaComportamento ^ (notaComportamento >>> 32));
		result = prime * result + (int) (notaComunicacao ^ (notaComunicacao >>> 32));
		result = prime * result + (int) (notaLider ^ (notaLider >>> 32));
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
		Equipe other = (Equipe) obj;
		if (alunos == null) {
			if (other.alunos != null)
				return false;
		} else if (!alunos.equals(other.alunos))
			return false;
		if (lider == null) {
			if (other.lider != null)
				return false;
		} else if (!lider.equals(other.lider))
			return false;
		if (liderEquipe != other.liderEquipe)
			return false;
		if (notaComportamento != other.notaComportamento)
			return false;
		if (notaComunicacao != other.notaComunicacao)
			return false;
		if (notaLider != other.notaLider)
			return false;
		return true;
	}
	
	
	
	

}
