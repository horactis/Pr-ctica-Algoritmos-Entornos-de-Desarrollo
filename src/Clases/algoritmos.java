package Clases;

public abstract class algoritmos {
	/**
	 * Devuelve el numero de fibonacci del numero que le pasan por parametros
	 * @param num parametro introducido
	 * @return int
	 */
	public int fibonacci (int num) {
		if (num < 0) {
			throw new IllegalArgumentException("el numero debe de ser positivo");
		}else {
			int f1 = 0, f2 = 1;
			for (int i = 2; i <= num; i++) {
				int f3 = f1 + f2;
				f1 = f2;
				f2 = f3;
			}
			return f2;
		}	
	}
	/**
	 * Calcula el factorial del numero que te pasan por parametros
	 * @param num parametro introducido
	 * @return numero entero con el factorial
	 */
	public int factorial(int num) {
		if (num < 0) {
			throw new IllegalArgumentException();
		}else {
			int resultado = 1;
			for (int i = 1; i <= num; i++) {
				resultado *= i;
			}
			return resultado;
		}
	}
	/**
	 * Devuelve true si el numero es primo y false si no lo es
	 * @param num parametro introducido
	 * @return true or false
	 */
	public boolean primo(int num) {
		if (num <= 0) {
			throw new IllegalArgumentException();
		}else {
			if(num == 2) return true;
			if (num % 2 == 0) {
				return false;
			}
			for (int i = 3; i*i <= num; i++) {
				if (num % i == 0) {
					return false;
				}
			}
			return true;
		}
	}
}
