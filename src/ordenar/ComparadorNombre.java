package ordenar;

public  class ComparadorNombre implements Comparador{
	public int comparar(Alumno a1,Alumno a2) {
		return (a1.nombres).compareTo(a2.nombres);
	}

}