package ordenar;

public class Alumno {
	public String codigo;
	public String nombres;
	public double nota;
	
	public Alumno() {
	}

	public Alumno(String codigo, String nombres, double nota) {
		this.codigo = codigo;
		this.nombres = nombres;
		this.nota = nota;
	}
	
	@Override
	public String toString() {
		return "{" + codigo + ", " + nombres + ", " + nota + "}";
	}
}