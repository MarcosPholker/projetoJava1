package cursoJava.classes;

import java.util.Objects;

public class Materia {
	private String diciplina1;
	private Double nota1;
	private String diciplina2;
	private Double nota2;
	private String diciplina3;
	private Double nota3;
	
	

	private String diciplina4;
	private Double nota4;
	
	
	
	public String getDiciplina1() {
		return diciplina1;
	}
	public void setDiciplina1(String diciplina1) {
		this.diciplina1 = diciplina1;
	}
	public String getDiciplina2() {
		return diciplina2;
	}
	public void setDiciplina2(String diciplina2) {
		this.diciplina2 = diciplina2;
	}
	public String getDiciplina3() {
		return diciplina3;
	}
	public void setDiciplina3(String diciplin3) {
		this.diciplina3 = diciplin3;
	}
	public String getDiciplina4() {
		return diciplina4;
	}
	public void setDiciplina4(String diciplina4) {
		this.diciplina4 = diciplina4;
	}
	
	/*notas do aluno */
	public Double getNota1() {
		return nota1;
	}
	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}
	public Double getNota2() {
		return nota2;
	}
	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}
	public Double getNota3() {
		return nota3;
	}
	public void setNota3(Double nota3) {
		this.nota3 = nota3;
	}
	public Double getNota4() {
		return nota4;
	}
	public void setNota4(Double nota4) {
		this.nota4 = nota4;
	}
	
	public Double mediaNota() {
		return (nota1 + nota2 + nota3 + nota4) / 4;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(diciplina3, diciplina1, diciplina2, diciplina4, nota1, nota2, nota3, nota4);
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
		return Objects.equals(diciplina3, other.diciplina3) && Objects.equals(diciplina1, other.diciplina1)
				&& Objects.equals(diciplina2, other.diciplina2) && Objects.equals(diciplina4, other.diciplina4)
				&& Objects.equals(nota1, other.nota1) && Objects.equals(nota2, other.nota2)
				&& Objects.equals(nota3, other.nota3) && Objects.equals(nota4, other.nota4);
	}
	@Override
	public String toString() {
		return "Materia [diciplina1=" + diciplina1 + ", nota1=" + nota1 + ", diciplina2=" + diciplina2 + ", nota2="
				+ nota2 + ", diciplina3=" + diciplina3 + ", nota3=" + nota3 + ", diciplina4=" + diciplina4 + ", nota4="
				+ nota4 + "]";
	}
	
}
