package processoSeletivo;

import java.util.List;

import javax.persistence.OneToMany;

@Entity
public class Dinamica {
	
	
	@Id
	@GeneratedValue
	@Column(name="Dinamica_id")
	private long id;
	@OneToMany(mappedBy="dinamica")
	List<Equipe> equipes;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<Equipe> getEquipes() {
		return equipes;
	}
	public void setEquipes(List<Equipe> equipes) {
		this.equipes = equipes;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((equipes == null) ? 0 : equipes.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
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
		Dinamica other = (Dinamica) obj;
		if (equipes == null) {
			if (other.equipes != null)
				return false;
		} else if (!equipes.equals(other.equipes))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	

}
