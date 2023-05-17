package cursoJava.classes;

import java.util.Objects;

public class Materia {
	private String diciplina;
	private Double nota;
	
	
	public String getDiciplina() {
		return diciplina;
	}
	public void setDiciplina(String diciplina) {
		this.diciplina = diciplina;
	}
	public Double getNota() {
		return nota;
	}
	public void setNota(Double nota) {
		this.nota = nota;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(diciplina, nota);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Materia other = (Materia) obj;
		return Objects.equals(diciplina, other.diciplina) && Objects.equals(nota, other.nota);
	}
	
	@Override
	public String toString() {
		return "diciplina=" + getDiciplina() + ", nota=" + getNota();
	}
	
	
}
