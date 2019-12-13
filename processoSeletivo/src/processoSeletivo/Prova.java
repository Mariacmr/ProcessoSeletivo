package processoSeletivo;

import java.util.Calendar;
import java.util.List;

@Entity
public class Prova {
	
	@Id
	@GeneratedValue
	private long id;
	private Calendar data;
	@OneToMany(mappedBy="prova")
	private List<Aluno> alunos;
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		return result;
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



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prova other = (Prova) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		return true;
	}
	
	
	

}
