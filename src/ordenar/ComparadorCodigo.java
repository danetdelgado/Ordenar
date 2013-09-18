package ordenar;

public class ComparadorCodigo implements Comparador {

	public int comparar(Alumno a1,Alumno a2) {
		return (a1.codigo).compareTo(a2.codigo);
	}

}
