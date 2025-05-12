package Clases;

public abstract class algoritmos {
	/*
	 * Devuelve el numero de fibonacci del numero que le pasan por parametros
	 * @param num parametro introducido
	 * @return int
	 */
	public int fibonacci (int numero) {
		if (numero < 0) {
			throw new IllegalArgumentException("el numero debe de ser positivo");
		}else {
			int f1 = 0, f2 = 1;
			for (int i = 2; i <= numero; i++) {
				int f3 = f1 + f2;
				f1 = f2;
				f2 = f3;
			}
			return f1;
		}	
	}
	
	public 
}
