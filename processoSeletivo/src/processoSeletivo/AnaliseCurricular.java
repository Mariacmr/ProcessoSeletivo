package processoSeletivo;

@Entity
@Table(name = "Analise")
public class AnaliseCurricular {
	
	
	@id
	@GeneratedValue
	@Column(name="id_AnaliseCurricular")
	private long id;
	private Curriculo curriculo;
	

	public String getCurriculo() {
		return curriculo.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((curriculo == null) ? 0 : curriculo.hashCode());
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
		AnaliseCurricular other = (AnaliseCurricular) obj;
		if (curriculo == null) {
			if (other.curriculo != null)
				return false;
		} else if (!curriculo.equals(other.curriculo))
			return false;
		return true;
	}

	

}
