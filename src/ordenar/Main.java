package ordenar;

public class Main {
	public static void ordenar(Alumno[] a, Comparador c) {
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<i; j++) {
				if (c.comparar(a[i],a[j]) < 0) {
					Alumno t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		
	}

	public static void imprimir(Alumno[] a) {
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		Alumno[] a = {
			new Alumno ("A2", "Juan Perez", 19),
			new Alumno ("A1", "Maria Castro", 14),
			new Alumno ("B1", "Alberto Ruiz", 17)
		};
		ordenar(a, new ComparadorCodigo());
		imprimir(a);
		
	}
}