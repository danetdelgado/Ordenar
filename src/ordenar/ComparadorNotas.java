package ordenar;

public class ComparadorNotas implements Comparador {
	@Override
	public int comparar(Alumno a1, Alumno a2) {
		return (int)(100*a1.nota - 100*a2.nota);
	}
}
