import java.util.Arrays;
import java.util.Scanner;

public class Ejemplo {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int v[] = new int[n];
		for (int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
		}
		// Para ordenar un arreglo
		Arrays.sort(v);
		for (int i = 0; i < n; i++) {
			System.out.print(v[i] + " ");
		}
		System.out.println("");
		// Busqueda Binaria para ver si existe algun elemento x
		int x = sc.nextInt();
		int L = 0, R = n;
		// v[L] < = x < v[R]
		// En la posicion L podria estar la posible respuesta
		// R es una invariante
		while (R - L > 1) {
			int mitad = (L + R) / 2;
			if (v[mitad] <= x) {
				L = mitad;
			} else {
				R = mitad;
			}
		}
	
		if (v[L] == x) {
			System.out.println("Existe y esta en la posicion "+L);
		} else {
			System.out.println("No existe");
		}

	}

}
